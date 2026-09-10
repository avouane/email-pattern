package builder.email;

public class EmailObjectBuilder implements EmailBuilder {
    private String from, to, subject, body;

    public EmailObjectBuilder setFrom(String from) { this.from = from; return this; }
    public EmailObjectBuilder setTo(String to) { this.to = to; return this; }
    public EmailObjectBuilder setSubject(String subject) { this.subject = subject; return this; }
    public EmailObjectBuilder setBody(String body) { this.body = body; return this; }
    public Email getResult() {
        return new Email(from, to, subject, body);
    }
}