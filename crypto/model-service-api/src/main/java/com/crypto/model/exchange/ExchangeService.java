package com.crypto.model.exchange;

public interface ExchangeService {

	public Exchange getExchange(String name);
	
	public void addPairToExchange(ExchangePair exchangePair, Exchange exchange);
}
