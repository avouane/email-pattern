package builder.email;

public class Email {
    private final String from, to, subject, body;
    Email(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
    @Override
    public String toString() {
        return "Email[" + from + " -> " + to +
                ", subject=" + subject +
                ", body=" + body + "]";}
}
