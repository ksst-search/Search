package Ksst;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;


public class SearchRobot {



    public String LoadUrlPage(String Url) throws Exception,FileNotFoundException,IOException {

        URL UrlName = new URL(Url);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(UrlName.openStream()));
        String line=new String();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            //System.out.println(inputLine);
            line=line+inputLine;
        }
        in.close();
        return line;

    }
    //функция принимает на вход содержимое страницы,список ссылок и добавляет ссылки из страницы в список.
    public static String ParceHtml(String html ) throws Exception {
        return Jsoup.parse(html).text();
    }

    public static List<String> ParceHtmllink(String html,List<String> links,int i ) throws Exception {
        Document doc = Jsoup.parse(html);
        for (Element element : doc.select("a[href]")) {
            if (element.attr("href").toString().charAt(0) == '/') {
                links.add(links.get(i)+element.attr("href"));
            } else {
                links.add(element.attr("href"));
            }
        }
        return links;
    }


    public static void UpdateDataBase(String Url) throws Exception {

    }
    public static void GetUrl() throws Exception {

    }
    public static void SendUrl() throws Exception {

    }


}
