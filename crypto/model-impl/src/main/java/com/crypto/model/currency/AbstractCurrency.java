package com.crypto.model.currency;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AbstractCurrency implements Currency {
	
	@NotNull
	@Size(min=1)
	private String symbol;
	
	@NotNull
	@Size(min=1)
	private String name;
	
	public AbstractCurrency(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	@Override
	public String getSymbol() {
		return this.symbol;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractCurrency other = (AbstractCurrency) obj;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}

}
