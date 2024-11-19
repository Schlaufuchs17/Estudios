import java.util.LinkedList;
import java.util.Queue;

class Email {
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

    @Override
    public String toString() {
        return String.format("ID: %d | Destinatario: %s | Remitente: %s | Asunto: %s | Cuerpo: %s",
                id, recipient, sender, subject, body);
    }
}

class EmailBuffer {
    private final Queue<Email> buffer = new LinkedList<>();
    private final int capacity;

    public EmailBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(Email email, String producerName) throws InterruptedException {
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

class Producer implements Runnable {
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
                Email email = new Email(i, "recipient" + i + "@domain.com",
                        "sender" + i + "@domain.com", "Subject " + i, "Body " + i);
                buffer.produce(email, producerName);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
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

public class EmailProcessor {
    public static void main(String[] args) {
        EmailBuffer buffer = new EmailBuffer(5);

        Thread producer1 = new Thread(new Producer(buffer, "Productor1"));
        Thread producer2 = new Thread(new Producer(buffer, "Productor2"));
        Thread producer3 = new Thread(new Producer(buffer, "Productor3"));

        Thread consumer1 = new Thread(new Consumer(buffer, "Consumidor1"));
        Thread consumer2 = new Thread(new Consumer(buffer, "Consumidor2"));

        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();
    }
}
