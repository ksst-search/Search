package Ksst;
/**
 * Created by StudentAlex on 06.07.2016.
 */
public class Search {
    public static void main(String[] args) throws Exception {
        String htmlstring=new String();
        SearchRobot RobotSearch=new SearchRobot();
        htmlstring=RobotSearch.LoadUrlPage("http://vk.com");
        System.out.println(htmlstring);
        System.out.println("//////////////");
        System.out.println("Parse Html");
        System.out.println("//////////////");
        htmlstring=RobotSearch.ParceHtml(htmlstring);
        System.out.println(htmlstring);
        System.out.println("//////////////");
        Application applet=new Application();
        applet.SendMessage("23","45");
    }

}

