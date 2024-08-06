import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class PizzaParty {
    public static void main(String[] args) {
        List<String> guests = Arrays.asList("Alice", "Bob", "Charlie");

        // Our Consumer to deliver pizza
        Consumer<String> pizzaDelivery = guest -> System.out.println("Delivering pizza to: " + guest + " 🍕");

        // Deliver pizza to each guest
        guests.forEach(pizzaDelivery);
    }
}
