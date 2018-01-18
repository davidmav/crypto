package com.crypto.model.currency;

import java.math.BigInteger;

public class AbstractCryptoCurrency extends AbstractCurrency implements CryptoCurrency {
	
	private BigInteger maxSupply;
	
	private String announcement;
	
	private String website;
	
	private String sourceCode;

	public AbstractCryptoCurrency(String symbol, String name, BigInteger maxSupply, String announcement, String website, String sourceCode) {
		super(symbol, name);
		this.maxSupply = maxSupply;
		this.announcement = announcement;
		this.website = website;
		this.sourceCode = sourceCode;
	}

	@Override
	public BigInteger getMaxSupply() {
		return this.maxSupply;
	}

	@Override
	public String getAnnouncement() {
		return this.announcement;
	}

	@Override
	public String getWebsite() {
		return this.website;
	}

	@Override
	public String getSourceCode() {
		return this.sourceCode;
	}

}
