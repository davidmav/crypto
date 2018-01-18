package com.crypto.service.coinmarketcap;

import java.io.IOException;
import java.net.MalformedURLException;

import com.crypto.model.currency.CoinmarketcapDTO;

public interface CoinsService {

	public CoinmarketcapDTO downloadDetailsFromCoinsMarketCap(CoinmarketcapDTO coin) throws MalformedURLException, IOException;
		
}
