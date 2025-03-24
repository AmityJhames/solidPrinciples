package solidPrinciples;

public class SendNotification implements EmailNotification{
    @Override
    public void sendEmail(String email) {
        System.out.println("Email notification sent to: "+ email);
    }
}
