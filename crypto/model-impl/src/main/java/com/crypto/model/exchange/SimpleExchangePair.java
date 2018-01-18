package com.crypto.model.exchange;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.crypto.model.currency.Currency;

public class SimpleExchangePair implements ExchangePair {
	
	private Set<Currency> exchangePair;
	
	private Collection<Exchange> exchanges;
	
	public SimpleExchangePair(Currency currency1, Currency currency2) {
		this.exchangePair = new HashSet<Currency>();
		assert currency1 != null && currency2 != null;
		this.exchangePair.add(currency1);
		this.exchangePair.add(currency2);
		this.exchanges = new HashSet<Exchange>();
	}

	@Override
	public Currency getCurrencyOne() {
		return this.exchangePair.iterator().next();
	}

	@Override
	public Currency getCurrencyTwo() {
		Iterator<Currency> iterator = this.exchangePair.iterator();
		iterator.next();
		return iterator.next();
	}

	@Override
	public Collection<Exchange> getExchanges() {
		return Collections.unmodifiableCollection(this.exchanges);
	}

	void addExchange(Exchange exchange) {
		this.exchanges.add(exchange);
	}

	void removeExchange(Exchange exchange) {
		this.exchanges.remove(exchange);
	}

}
