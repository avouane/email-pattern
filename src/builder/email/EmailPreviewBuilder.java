package builder.email;

public class EmailPreviewBuilder implements EmailBuilder {
    private final StringBuilder sb = new StringBuilder("=== Email Preview ===\n");
    public EmailPreviewBuilder setFrom(String from) {
        sb.append("From:    ").append(from).append("\n"); return this; }
    public EmailPreviewBuilder setTo(String to) {
        sb.append("To:      ").append(to).append("\n"); return this; }
    public EmailPreviewBuilder setSubject(String subject) {
        sb.append("Subject: ").append(subject).append("\n"); return this; }
    public EmailPreviewBuilder setBody(String body) {
        sb.append("Body:    ").append(body).append("\n"); return this; }
    private String subject, to;
    public String getResult() {
        if (to == null || subject == null)
            throw new IllegalStateException("To and Subject are required");
        return sb.toString();
    }
}