package ge.edu.ug.solid.dip.notifications;

import org.junit.jupiter.api.Test;

import java.util.List;

class NotificationManagerTest {
    @Test
    public void testNotificationManager() {
        List<String> recipients = List.of("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides");

        SmsService smsService = new SmsService();
        NotificationManager manager = new NotificationManager(smsService);

        recipients.forEach(recipient -> manager.notify(recipient, "Hello", "Welcome to the company!"));
    }

}
