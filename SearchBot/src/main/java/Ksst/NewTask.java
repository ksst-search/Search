package Ksst;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * Created by StudentAlex on 07.07.2016.
 */
public class NewTask {

    private static final String TASK_QUEUE_NAME = "task_queue";

    public static void main(String[] argv)
            throws java.io.IOException, TimeoutException,Exception {

        String htmlstring=new String();
        List<String> link =new ArrayList<String>();
        link.add("http://yandex.ru");
        link.add("http://google.ru");
        SearchRobot RobotSearch=new SearchRobot();
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);
        /////////////////////////////////////////////////////////////////
        String message ;
        for(int i=0;i<link.size();i++) {
            //отправка сообщений с адресами из списка
            try {
                message = getMessage(link.get(i));
                channel.basicPublish("", TASK_QUEUE_NAME,
                        MessageProperties.PERSISTENT_TEXT_PLAIN,
                        message.getBytes());
                System.out.println(" [x] Sent '" + message + "'");
                htmlstring = RobotSearch.LoadUrlPage(message);
                RobotSearch.ParceHtmllink(htmlstring, link, i);
            }catch (Exception ex)
            {System.out.println(ex);}
        }


        /////////////////////////////////////////////////////////////////
        channel.close();
        connection.close();
    }

    private static String getMessage(String strings){
        if (strings.length() < 1)
            return "Hello World!";
        return joinStrings(strings,"");

    }
    private static String joinStrings(String strings, String delimiter) {
        int length = strings.length();
        if (length == 0) return "";
      //  StringBuilder words = new StringBuilder(strings[0]);
      //  for (int i = 1; i < length; i++) {
         //   words.append(delimiter).append(strings[i]);
       // }
        return strings;
    }

}