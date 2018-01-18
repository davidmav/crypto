package com.crypto.model.history;

import com.crypto.model.currency.Currency;

public interface CurrencyStatService {

	public CurrencyStat replaceBaseCurrency(CurrencyStat stat, Currency baseCurrency);
	
}
