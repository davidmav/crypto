package com.crypto.integration.trigger;

import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.client.RestTemplate;

import com.crypto.model.currency.CoinmarketcapDTO;

/**
 * Read coin info from coinmarketcap into CoinmarketcapDTO objects
 * @author davidm
 *
 */
@Configuration
public class InboundMessagesGateway {

	@InboundChannelAdapter(value = "inboundChannel", poller = @Poller(fixedDelay = "${poller.interval:60000}", maxMessagesPerPoll = "1"))
	public Message<CoinmarketcapDTO[]> getAllCryptoCurrency() {
        RestTemplate restTemplate = new RestTemplate();
        CoinmarketcapDTO[] coins = restTemplate.getForObject("https://api.coinmarketcap.com/v1/ticker/?limit=10000", CoinmarketcapDTO[].class);
        MessageBuilder<CoinmarketcapDTO[]> builder = MessageBuilder.withPayload(coins);
		return builder.build();
	}
}
