import java.util.LinkedList;
import java.util.Queue;

public class EmailBuffer {
    private final Queue<Email> buffer = new LinkedList<>();
    private final int capacity;

    public EmailBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(Email email, String producerName) throws InterruptedException {
        if (email.getRecipient().equalsIgnoreCase("pikachu@gmail.com")) {
            System.out.printf("Correo descartado por destinatario inválido: %s%n", email);
            return;
        }

        while (buffer.size() == capacity) {
            wait();
        }

        buffer.add(email);
        System.out.printf("Productor %s añadió email %d al buffer%n", producerName, email.id);
        notifyAll();
    }

    public synchronized Email consume(String consumerName) throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }

        Email email = buffer.poll();
        System.out.printf("Consumidor %s procesó %s%n", consumerName, email);
        notifyAll();
        return email;
    }
}
