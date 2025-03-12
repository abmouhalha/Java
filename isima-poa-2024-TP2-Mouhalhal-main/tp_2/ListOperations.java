import java.util.*;


public class ListOperations {

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>(); 

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        return evenNumbers; 
    }
   

}
