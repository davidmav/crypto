package com.crypto.model.history;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import com.crypto.model.currency.CryptoCurrency;
import com.crypto.model.currency.Currency;

public interface CurrencyStat {
	
	public CryptoCurrency getCryptoCurrency();
	
	public Currency getBaseCurrency();
	
	public Date getTimestamp();

	public BigInteger getVolume24h();
	
	public BigDecimal getPrice();
	
	public BigInteger getCirculatingSupply();
	
	public Double getChange24h();
	
}
