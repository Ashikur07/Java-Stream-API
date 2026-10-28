package Foundation;

import java.util.*;

public class UpperCase {
     public static void main(String[] args) {

        List<String> Users =
            Arrays.asList("ashik", "rahim", "karim");

        // Convert all strings to uppercase using the map() method
        List<String> result = Users.stream()
            .map(n -> n.toUpperCase())
            .toList();

        // Print the list containing uppercase strings
        System.out.println(result);
    }
}
