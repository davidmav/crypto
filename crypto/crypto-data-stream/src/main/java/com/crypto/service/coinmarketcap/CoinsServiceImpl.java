package com.crypto.service.coinmarketcap;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.crypto.integration.augmentation.AugmentationTransformer;
import com.crypto.model.currency.CoinmarketcapDTO;

@Service
public class CoinsServiceImpl implements CoinsService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(CoinsServiceImpl.class);

	@Override
	public CoinmarketcapDTO downloadDetailsFromCoinsMarketCap(CoinmarketcapDTO coin) throws MalformedURLException, IOException {
		Document coinPageDocument = Jsoup.parse(new URL("https://coinmarketcap.com/currencies/" + coin.getId() + "/"), 10000);

		Set<String> webSites = new HashSet<String>();
		Set<String> explorers = new HashSet<String>();
		Set<String> messageBoards = new HashSet<String>();
		Set<String> chats = new HashSet<String>();

		Element importantInfo = coinPageDocument.getElementsByAttributeValue("class", "container").get(0).getElementsByAttributeValue("class", "list-unstyled").get(0);
		Elements elementsByTag = importantInfo.getElementsByTag("li");

		for (Element element : elementsByTag) {

			Element span = element.getElementsByTag("span").get(0);
			String title = span.attr("title");

			if ("Website".equals(title)) {
				String websiteUrl = getLink(element);
				webSites.add(websiteUrl);
			} else if ("Explorer".equals(title)) {
				String explorerUrl = getLink(element);
				explorers.add(explorerUrl);
			} else if ("Message Board".equals(title)) {
				String messageBoardUrl = getLink(element);
				messageBoards.add(messageBoardUrl);
			} else if ("Tags".equals(title)) {
				Elements elementsByTag2 = element.getElementsByTag("small");
				for (Element smallElement : elementsByTag2) {
					String tag = smallElement.child(0).text();
					if ("Mineable".equals(tag)) {
						coin.setMineable(true);
					} else if ("Coin".equals(tag)) {
						coin.setIsCoin(true);
					}
				}
			} else if ("Source Code".equals(title)) {
				coin.setSourceCode(getLink(element));
			} else if ("Chat".equals(title)) {
				String chatUrl = getLink(element);
				chats.add(chatUrl);
			} else if ("Announcement".equals(title)) {
				coin.setAnnouncementUrl(getLink(element));
			}

		}

		coin.setWebSites(webSites);
		coin.setExplorers(explorers);
		coin.setMessageBoards(messageBoards);
		coin.setChats(chats);
		LOGGER.info("Successfully downloaded details for " + coin.getName());
		return coin;
	}

	private String getLink(Element element) {
		return element.getElementsByTag("a").get(0).attr("href");
	}

}
