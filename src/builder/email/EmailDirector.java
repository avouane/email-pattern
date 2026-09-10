package builder.email;

public class EmailDirector {
    public void makeWelcomeEmail(EmailBuilder b, String recipient) {
        b.setFrom("no-reply@example.com")
                .setTo(recipient)
                .setSubject("Welcome aboard!")
                .setBody("Thanks for signing up. Your account is ready to use.");
    }
}
