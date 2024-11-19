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
