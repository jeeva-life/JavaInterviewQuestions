package interviewTopicsJava;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicateExample {
	
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Predicate to check if a number is even
	        Predicate<Integer> isEven = number -> number % 2 == 0;

	        // Using Predicate with Stream to filter even numbers
	        List<Integer> evenNumbers = numbers.stream()
	                                           .filter(isEven)
	                                           .collect(Collectors.toList());

	        System.out.println("Even Numbers: " + evenNumbers); // Output: [2, 4, 6, 8, 10]
	    }
	}


