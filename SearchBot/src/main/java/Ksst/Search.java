package Ksst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentAlex on 06.07.2016.
 */
public class Search {
    public static void main(String[] args) throws Exception {
      List<String> link =new ArrayList<String>();
        link.add("http://yandex.ru");
        link.add("http://google.ru");
        SearchRobot RobotSearch=new SearchRobot();
        String htmlstring=new String();
        //пока не дойдем до конца списка
        for(int i=0;i<link.size();i++)
        {
            //отправляем адрес
            System.out.println("/////////////////////////");
            System.out.println(link.get(i).toString());
            System.out.println("/////////////////////////");
            Application applet=new Application();
            applet.SendMessage(link.get(i).toString(),"23");
            //загружаем страницу по полученному адресу
            htmlstring=RobotSearch.LoadUrlPage(link.get(i).toString());
            htmlstring=RobotSearch.ParceHtml(htmlstring);
            RobotSearch.ParceHtmllink(htmlstring,link);
        }

       // String htmlstring=new String();
       //SearchRobot RobotSearch=new SearchRobot();
     //   htmlstring=RobotSearch.LoadUrlPage("http://vk.com");
      //  System.out.println(htmlstring);
       // System.out.println("//////////////");
       // System.out.println("Parse Html");
      //  System.out.println("//////////////");
      //  //htmlstring=RobotSearch.ParceHtml(htmlstring);
      //  System.out.println(htmlstring);
      //  System.out.println("//////////////");

        System.out.println("//////////////");
    }

}
