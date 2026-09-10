package builder.email;

public class EmailPreviewBuilder implements EmailBuilder {
    private final StringBuilder sb = new StringBuilder("=== Email Preview ===\n");

    public EmailPreviewBuilder setFrom(String from) { sb.append("From:    ").append(from).append("\n"); return this; }
    public EmailPreviewBuilder setTo(String to) { sb.append("To:      ").append(to).append("\n"); return this; }

}