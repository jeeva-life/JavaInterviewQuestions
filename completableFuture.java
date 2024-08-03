import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        // Start asynchronous task
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task like fetching user data
            simulateDelay();
            System.out.println("Fetched user data");
            return "User data";
        }).thenAccept(data -> {
            // Process the data once it's available
            System.out.println("Processing " + data);
        });

        // Continue doing other work while the data is being fetched
        System.out.println("Doing other work...");

        // Wait for async task to complete (for demonstration purposes)
        future.join();

        System.out.println("All tasks completed");
    }

    private static void simulateDelay() {
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
