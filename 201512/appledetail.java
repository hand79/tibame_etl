package appledaily;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class appledetail {
	public static void main(String[] args) throws IOException {
		Document doc;
		doc = Jsoup
				.connect(
						"http://www.appledaily.com.tw/realtimenews/article/local/20160311/813798/%E6%93%94%E5%BF%83%E8%A2%AB%E5%81%B7%E6%96%A4%E6%B8%9B%E5%85%A9%E3%80%80%E9%81%95%E5%81%9C%E7%8F%BE%E7%A7%A4%E5%85%A8%E6%B2%92%E6%94%B6")
				.get();
		String title = doc.select("#h1").text();
		String content = doc.select("div.articulum.trans").text();
		String dt = doc.select("div.gggs > time").text();
		System.out.println(title);
		System.out.println(content);
		System.out.println(dt);

	}
}
