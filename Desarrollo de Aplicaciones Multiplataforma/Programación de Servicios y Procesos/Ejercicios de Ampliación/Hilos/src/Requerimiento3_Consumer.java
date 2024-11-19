public class Consumer implements Runnable {
    private final EmailBuffer buffer;
    private final String consumerName;

    public Consumer(EmailBuffer buffer, String consumerName) {
        this.buffer = buffer;
        this.consumerName = consumerName;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume(consumerName);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
