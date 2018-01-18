package com.crypto.model.currency;

import java.math.BigInteger;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SimpleToken extends AbstractCryptoCurrency implements Token {
	
	@NotNull
	@Size(min=1)
	private String platform;

	public SimpleToken(String symbol, String name, BigInteger maxSupply, String announcement, String website, String sourceCode, String platform) {
		super(symbol, name, maxSupply, announcement, website, sourceCode);
		this.platform = platform;
	}

	@Override
	public String getPlatform() {
		return this.platform;
	}

}
