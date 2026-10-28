package Foundation;
import java.util.*;

public class EvenNumber {
    
      public static void main(String[] args) {

        List<Integer> numbers =
            Arrays.asList(10, 15, 20, 25, 30);

        // Filter even numbers using Java Stream API
        List<Integer> evenNumbers = numbers.stream()
            .filter(num -> num % 2 == 0)
            .toList();

        // Print the list of even numbers
        System.out.println(evenNumbers);
    }
}
