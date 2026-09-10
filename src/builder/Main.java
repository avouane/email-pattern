package builder;
import builder.email.Email;
import builder.email.EmailDirector;
import builder.email.EmailObjectBuilder;
import builder.email.EmailPreviewBuilder;

public class Main {
    public static void main(String[] args) {
        EmailDirector director = new EmailDirector();
        EmailObjectBuilder objBuilder = new EmailObjectBuilder();
        director.makeWelcomeEmail(objBuilder, "user@example.com");
        Email welcomeEmail = objBuilder.getResult();
        System.out.println(welcomeEmail);
        EmailPreviewBuilder previewBuilder = new EmailPreviewBuilder();
        director.makeWelcomeEmail(previewBuilder, "user@example.com");
        String preview = previewBuilder.getResult();
        System.out.println(preview);
    }
}