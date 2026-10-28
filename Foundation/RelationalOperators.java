package Foundation;
import  java.util.*;

public class RelationalOperators {

         public static void main(String[] args) {

        List<Integer> Users =
            Arrays.asList(3, 12, 8, 25, 7, 18, 33, 45, 55, 22);

        // Filter numbers greater than 12 and less than or equal to 50
        List<Integer> result = Users.stream()
            .filter(n -> (12<n && n<=50))
            .toList();

       // Print the filtered numbers using Java Stream API
        System.out.println(result);
    }

}