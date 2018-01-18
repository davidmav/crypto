package com.crypto.integration.augmentation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;

import com.crypto.model.currency.CoinmarketcapDTO;
import com.crypto.service.coinmarketcap.CoinsService;

@Configuration
public class AugmentationTransformer {

	private static Logger LOGGER = LoggerFactory.getLogger(AugmentationTransformer.class);
	
	@Autowired
	private CoinsService coinsService;
	
	@Transformer(inputChannel = "inboundChannel", outputChannel ="nullChannel")
	public Message<?> processCoinsMessage(Message<CoinmarketcapDTO[]> coins) throws MalformedURLException, IOException {
		LOGGER.info("Received coins message");
		
		CoinmarketcapDTO[] coinsData = coins.getPayload();
		List<CoinmarketcapDTO> asList = Arrays.asList(coinsData);
		
		asList = asList.stream().map(coin->{
			try {
				return coinsService.downloadDetailsFromCoinsMarketCap(coin);
			} catch (IOException e) {
				LOGGER.error("Error while parsing data for coin " + coin.getName() + " from coinmarketcap", e);
				return coin;
			}
			
		}).collect(Collectors.toList());
		
		return coins;
	}
}
