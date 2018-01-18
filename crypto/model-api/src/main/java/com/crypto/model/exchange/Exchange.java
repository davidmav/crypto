package com.crypto.model.exchange;

import java.util.Collection;

public interface Exchange {

	public String getName();
	
	public String getUrl();
	
	public Collection<ExchangePair> getExchangePairs();
}
