package MUHTAR;

import org.apache.commons.mail.SimpleEmail;

public class SendEmail {


    public static void main(String[] args) {

        String username = "kelimu0316@gmail.com",
                password = "112180Dmm",
                reciever = "imran1niyaz@gmail.com",
                MSG = "hi Imran!";


        int i = 1;
        while (i <= 5) {
            sendEmails(username, password, reciever, MSG);
            System.out.println("send");


        }
    }

    public static void sendEmails(String username, String password, String reciever, String MSG) {


        SimpleEmail email=new SimpleEmail();
        email.setHostName("meryem");
        email.setSmtpPort(465);
        email.setAuthentication(username,password);
        email.setSSLOnConnect(true);

        try {
            email.setFrom(username);
            email.setMsg(MSG);
            email.setSubject("Testing");
            email.addTo(reciever);
            email.send();
        }catch (Exception e){}

        }

    }
