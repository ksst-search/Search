package Ksst;

import org.jsoup.Jsoup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class SearchRobot {

    public String LoadUrlPage(String Url) throws Exception,FileNotFoundException,IOException {

        URL UrlName = new URL(Url);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(UrlName.openStream()));
        String line=new String();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            line=line+inputLine;
        }
        in.close();
        return line;

    }
    public static String ParceHtml(String html) throws Exception {
        return Jsoup.parse(html).text();
    }

    public static void UpdateDataBase(String Url) throws Exception {

    }
    public static void GetUrl() throws Exception {

    }



}
