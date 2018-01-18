package com.crypto.model.exchange;

import java.util.Collection;

import com.crypto.model.currency.Currency;

public interface ExchangePair {

	public Currency getCurrencyOne();
	
	public Currency getCurrencyTwo();
	
	public Collection<Exchange> getExchanges();

}
