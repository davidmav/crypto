package com.crypto.model.history;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.crypto.model.currency.CryptoCurrency;
import com.crypto.model.currency.Currency;

public class SimpleCurrencyStat implements CurrencyStat {

	@NotNull
	private CryptoCurrency currency;
	
	@NotNull
	private Currency baseCurrency;
	
	@NotNull
	private Date timestamp;

	@NotNull
	private BigInteger volume24h;

	@NotNull
	private BigDecimal price;

	@NotNull
	private BigInteger circulatingSupply;

	@NotNull
	private Double change24h;

	@Override
	public CryptoCurrency getCryptoCurrency() {
		return this.currency;
	}

	@Override
	public Date getTimestamp() {
		return this.timestamp;
	}

	@Override
	public BigInteger getVolume24h() {
		return this.volume24h;
	}

	@Override
	public BigDecimal getPrice() {
		return this.price;
	}

	@Override
	public BigInteger getCirculatingSupply() {
		return this.circulatingSupply;
	}

	@Override
	public Double getChange24h() {
		return this.change24h;
	}

	@Override
	public Currency getBaseCurrency() {
		return this.baseCurrency;
	}


}
