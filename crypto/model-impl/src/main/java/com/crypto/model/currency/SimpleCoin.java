package com.crypto.model.currency;

import java.math.BigInteger;

public class SimpleCoin extends AbstractCryptoCurrency implements Coin {

	private String algorithm;
	
	public SimpleCoin(String symbol, String name, BigInteger maxSupply, String announcement, String website, String sourceCode, String algorithm) {
		super(symbol, name, maxSupply, announcement, website, sourceCode);
		this.algorithm = algorithm;
	}

	@Override
	public String getAlgorithm() {
		return this.algorithm;
	}

}
