package com.crypto.model.exchange;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SimpleExchange implements Exchange {

	@NotNull
	@Size(min=1)
	private String name;
	
	@NotNull
	@Size(min=1)
	private String url;
	
	private Collection<ExchangePair> exchangePairs;
	
	public SimpleExchange(String name, String url) {
		this.name = name;
		this.url = url;
		this.exchangePairs = new HashSet<ExchangePair>();
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getUrl() {
		return this.url;
	}

	@Override
	public Collection<ExchangePair> getExchangePairs() {
		return Collections.unmodifiableCollection(this.exchangePairs);
	}
	
	void addExchangePair(ExchangePair exchangePair) {
		this.exchangePairs.add(exchangePair);
	}

	void removeExchangPaire(ExchangePair exchangePair) {
		this.exchangePairs.remove(exchangePair);
	}

}
