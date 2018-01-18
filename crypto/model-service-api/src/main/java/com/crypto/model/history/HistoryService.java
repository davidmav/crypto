package com.crypto.model.history;

import java.util.Collection;
import java.util.Date;

import com.crypto.model.currency.CryptoCurrency;
import com.crypto.model.exchange.Exchange;

public interface HistoryService {
	
	public Collection<CurrencyStat> getHistoryByCurrencyBetweenFromDateAndToDate(CryptoCurrency currency, Date fromDate, Date toDate);
	
	public Collection<CurrencyStat> getHistoryByCurrencyAndExchangeBetweenFromDateAndToDate(CryptoCurrency currency, Exchange exchange, Date fromDate, Date toDate);


}
