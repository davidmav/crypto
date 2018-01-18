package com.crypto.model.currency;

import java.math.BigDecimal;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinmarketcapDTO {
	
	@JsonProperty
	private String id;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private String symbol;
	
	@JsonProperty
	private int rank;
	
	@JsonProperty("price_usd")
	private BigDecimal priceUSD;
	
	@JsonProperty("price_btc")
	private BigDecimal priceBTC;
	
	@JsonProperty("24h_volume_usd")
	private BigDecimal twentyFourHourVolumeUSD;
	
	@JsonProperty("market_cap_usd")
	private BigDecimal marketCapUSD;
	
	@JsonProperty("available_supply")
	private BigDecimal availableSupply;
	
	@JsonProperty("total_supply")
	private BigDecimal totalSupply;
	
	@JsonProperty("max_supply")
	private BigDecimal maxSupply;
	
	@JsonProperty("percent_change_1h")
	private BigDecimal percentChangeOneHour;
	
	@JsonProperty("percent_change_24h")
	private BigDecimal percentChangeTwentyFourHour;
	
	@JsonProperty("percent_change_7d")
	private BigDecimal percentChangeSevenDays;
	
	@JsonProperty("last_updated")
	private long secondsEpochUpdate;
	
	private Set<String> webSites;
	private Set<String> explorers;
	private String announcementUrl;
	private String sourceCode;
	private Set<String> messageBoards;
	private Set<String> chats;
	private Boolean mineable = false;
	private Boolean isCoin = false;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public BigDecimal getPriceUSD() {
		return priceUSD;
	}

	public void setPriceUSD(BigDecimal priceUSD) {
		this.priceUSD = priceUSD;
	}

	public BigDecimal getPriceBTC() {
		return priceBTC;
	}

	public void setPriceBTC(BigDecimal priceBTC) {
		this.priceBTC = priceBTC;
	}

	public BigDecimal getTwentyFourHourVolumeUSD() {
		return twentyFourHourVolumeUSD;
	}

	public void setTwentyFourHourVolumeUSD(BigDecimal twentyFourHourVolumeUSD) {
		this.twentyFourHourVolumeUSD = twentyFourHourVolumeUSD;
	}

	public BigDecimal getMarketCapUSD() {
		return marketCapUSD;
	}

	public void setMarketCapUSD(BigDecimal marketCapUSD) {
		this.marketCapUSD = marketCapUSD;
	}

	public BigDecimal getAvailableSupply() {
		return availableSupply;
	}

	public void setAvailableSupply(BigDecimal availableSupply) {
		this.availableSupply = availableSupply;
	}

	public BigDecimal getTotalSupply() {
		return totalSupply;
	}

	public void setTotalSupply(BigDecimal totalSupply) {
		this.totalSupply = totalSupply;
	}

	public BigDecimal getMaxSupply() {
		return maxSupply;
	}

	public void setMaxSupply(BigDecimal maxSupply) {
		this.maxSupply = maxSupply;
	}

	public BigDecimal getPercentChangeOneHour() {
		return percentChangeOneHour;
	}

	public void setPercentChangeOneHour(BigDecimal percentChangeOneHour) {
		this.percentChangeOneHour = percentChangeOneHour;
	}

	public BigDecimal getPercentChangeTwentyFourHour() {
		return percentChangeTwentyFourHour;
	}

	public void setPercentChangeTwentyFourHour(BigDecimal percentChangeTwentyFourHour) {
		this.percentChangeTwentyFourHour = percentChangeTwentyFourHour;
	}

	public BigDecimal getPercentChangeSevenDays() {
		return percentChangeSevenDays;
	}

	public void setPercentChangeSevenDays(BigDecimal percentChangeSevenDays) {
		this.percentChangeSevenDays = percentChangeSevenDays;
	}

	public long getSecondsEpochUpdate() {
		return secondsEpochUpdate;
	}

	public void setSecondsEpochUpdate(long secondsEpochUpdate) {
		this.secondsEpochUpdate = secondsEpochUpdate;
	}

	public Set<String> getWebSites() {
		return webSites;
	}

	public Set<String> getExplorers() {
		return explorers;
	}

	public String getAnnouncementUrl() {
		return announcementUrl;
	}

	public String getSourceCode() {
		return sourceCode;
	}

	public Set<String> getMessageBoards() {
		return messageBoards;
	}

	public Set<String> getChats() {
		return chats;
	}

	public Boolean getMineable() {
		return mineable;
	}

	public Boolean getIsCoin() {
		return isCoin;
	}

	public void setWebSites(Set<String> webSites) {
		this.webSites = webSites;
	}

	public void setExplorers(Set<String> explorers) {
		this.explorers = explorers;
	}

	public void setAnnouncementUrl(String announcementUrl) {
		this.announcementUrl = announcementUrl;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public void setMessageBoards(Set<String> messageBoards) {
		this.messageBoards = messageBoards;
	}

	public void setChats(Set<String> chats) {
		this.chats = chats;
	}

	public void setMineable(Boolean mineable) {
		this.mineable = mineable;
	}

	public void setIsCoin(Boolean isCoin) {
		this.isCoin = isCoin;
	}
	
}
