import com.sendgrid.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SendEmailTest {

    @Test
    void main() {
        Email from = new Email();
        Email to = new Email();
        String subject = "";
        Content content = new Content("text/plain", "This is quite simple to implement.");
        Mail mail = new Mail(from, subject, to, content);

        assertNotNull(mail);
    }
}