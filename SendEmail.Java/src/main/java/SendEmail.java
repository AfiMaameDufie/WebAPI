import com.sendgrid.*;
import java.io.IOException;

public class SendEmail {
    public static void main(String[] args) throws IOException {
        Email from = new Email("abigail.gbadago@turntabl.io");
        Email to = new Email("afimaamedufie@gmail.com");
        String subject = "Test for sending emails with Twilio SendGrid";
        Content content = new Content("text/plain", "This is quite simple to implement.");
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID API KEY"));
        Request request = new Request();

        try{
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response =sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        }catch (IOException e) {
            throw e;
        }



    }
}
