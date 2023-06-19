package ParserHtml;
/* JSoup, версия: 1.16.1
библиотека была скачана с mvnrepository.com
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser1 {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://ru.wikipedia.org/").get();
            Elements titleElements = document.select("h3");//<h3>, <h1>, <p>, <a>
            for (var element : titleElements) {
                System.out.println(element.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}