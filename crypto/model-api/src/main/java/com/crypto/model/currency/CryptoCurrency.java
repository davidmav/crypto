package com.crypto.model.currency;

import java.math.BigInteger;

public interface CryptoCurrency extends Currency {

	/**
	 * Returns the max supply of tokens
	 * @return
	 */
	public BigInteger getMaxSupply();
	
	/**
	 * Returns a URL of the currency announcement on bitcoin talk
	 * @return
	 */
	public String getAnnouncement();
	
	/**
	 * Returns a URL for the crypto currency website
	 * @return
	 */
	public String getWebsite();
	
	/**
	 * Returns the github address
	 * @return
	 */
	public String getSourceCode();
	
}
