import java.lang.reflect.Field;

class Car {
    private String brand = "Toyota";
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Car car = new Car();
            
            // Get the Class object
            Class<?> carClass = car.getClass();
            
            // Access the private field 'brand'
            Field brandField = carClass.getDeclaredField("brand");
            brandField.setAccessible(true); // Make it accessible
            
            // Print the value of the field
            System.out.println("Car brand: " + brandField.get(car));
            
            // Modify the value of the field
            brandField.set(car, "Honda");
            System.out.println("Updated car brand: " + brandField.get(car));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
