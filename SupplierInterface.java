import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        // Create a Supplier to generate random numbers
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        // Use the Supplier to get a random number
        int randomNumber = randomSupplier.get();
        System.out.println("Random Number: " + randomNumber);

        // Let's get another random number
        int anotherRandomNumber = randomSupplier.get();
        System.out.println("Another Random Number: " + anotherRandomNumber);
    }
}
