package Foundation;

import java.util.*;

public class NamesStartingWithA {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Ashik", "Rahim", "Anik", "Karim", "Arif"
        );

       // Filter names that start with the letter 'A' using Java Stream API
        List<String> result = names.stream()
            .filter(name -> name.startsWith("A"))
            .toList();

        // Print the filtered list of names
        System.out.println(result);
    }
}
