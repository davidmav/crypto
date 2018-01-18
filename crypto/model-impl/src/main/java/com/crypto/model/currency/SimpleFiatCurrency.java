package com.crypto.model.currency;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SimpleFiatCurrency extends AbstractCurrency implements FiatCurrency {
	
	@NotNull
	@Size(min=1)
	private String country;

	public SimpleFiatCurrency(String symbol, String name, String country) {
		super(symbol, name);
		this.country = country;
	}

	@Override
	public String getCountry() {
		return this.country;
	}

}
