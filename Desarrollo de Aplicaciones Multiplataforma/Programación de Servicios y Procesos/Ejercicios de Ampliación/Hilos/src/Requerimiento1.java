import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrimeCheckTask implements Runnable {
    private final int number;

    public PrimeCheckTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        boolean isPrime = isPrime(number);
        long endTime = System.currentTimeMillis();
        String threadName = Thread.currentThread().getName();

        System.out.printf("Número: %d | Hilo: %s | Tiempo: %d ms | Primo: %b%n",
                number, threadName, (endTime - startTime), isPrime);
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class PrimeChecker {
    public static void main(String[] args) {
        int[] numbers = {29, 15, 23, 16};
        ExecutorService executor = Executors.newFixedThreadPool(numbers.length);

        for (int number : numbers) {
            executor.execute(new PrimeCheckTask(number));
        }

        executor.shutdown();
    }
}
