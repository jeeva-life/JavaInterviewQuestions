public class CoffeeShopSimulation {

    public static void main(String[] args) {
        // User thread (barista making coffee)
        Thread baristaThread = new Thread(() -> {
            System.out.println("☕ Barista: Making coffee for customers...");
            try {
                Thread.sleep(3000); // Simulating work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("☕ Barista: Coffee is ready!");
        });

        // Daemon thread (background music)
        Thread musicThread = new Thread(() -> {
            while (true) {
                System.out.println("🎵 Playing relaxing background music...");
                try {
                    Thread.sleep(1000); // Simulating background work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        musicThread.setDaemon(true); // Set the music thread as a daemon

        // Start both threads
        baristaThread.start();
        musicThread.start();

        // Wait for barista thread to finish
        try {
            baristaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("🚪 Coffee shop is closing. See you tomorrow!");
    }
}
