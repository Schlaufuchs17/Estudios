public class Email {
    private final int id;
    private final String recipient;
    private final String sender;
    private final String subject;
    private final String body;

    public Email(int id, String recipient, String sender, String subject, String body) {
        this.id = id;
        this.recipient = recipient;
        this.sender = sender;
        this.subject = subject;
        this.body = body;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Destinatario: %s | Remitente: %s | Asunto: %s | Cuerpo: %s",
                id, recipient, sender, subject, body);
    }
}
