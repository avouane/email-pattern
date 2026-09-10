package builder.app;

public class Main {
    public static void main(String[] args) {
        EmailDirector director = new EmailDirector();
        EmailObjectBuilder objBuilder = new EmailObjectBuilder();
        director.makeWelcomeEmail(objBuilder, "user@example.com");
        Email welcomeEmail = objBuilder.getResult();
        System.out.println(welcomeEmail);
    }
}