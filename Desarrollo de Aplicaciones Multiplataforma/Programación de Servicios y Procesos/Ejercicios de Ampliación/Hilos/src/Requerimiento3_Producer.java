public class Producer implements Runnable {
    private final EmailBuffer buffer;
    private final String producerName;

    public Producer(EmailBuffer buffer, String producerName) {
        this.buffer = buffer;
        this.producerName = producerName;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String recipient = (i % 2 == 0) ? "pikachu@gmail.com" : "recipient" + i + "@domain.com";
                Email email = new Email(i, recipient, "sender" + i + "@domain.com", "Subject " + i, "Body " + i);
                buffer.produce(email, producerName);
                Thread.sleep(500);
                
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
