import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {
        // Create an ExecutorService with virtual threads
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        // Submit multiple tasks to run in parallel using virtual threads
        for (int i = 0; i < 100; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Running task " + taskNumber + " in " + Thread.currentThread());
                try {
                    Thread.sleep(1000); // Simulate a task taking some time
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        // Gracefully shut down the executor
        executor.shutdown();
    }
}
