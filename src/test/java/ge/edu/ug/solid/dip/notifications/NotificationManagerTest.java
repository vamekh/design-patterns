package ge.edu.ug.solid.dip.notifications;

import org.junit.jupiter.api.Test;

import java.util.List;

class NotificationManagerTest {
    @Test
    public void testNotificationManager() {
        List<String> recipients = List.of("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides");

        NotificationManager manager = new NotificationManager(new SmsService());

        recipients.forEach(recipient -> manager.notify(recipient, "Good news", "SOLID principals are eternal!"));

        manager.setSenderService(new EmailService());
        recipients.forEach(recipient -> manager.notify(recipient, "Nice to know", "Design patterns are awesome!"));
    }
}
