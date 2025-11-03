import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        causeCastException();
        causeArrayIndex();
        causeIndexException();
    }

    // ❌ This will cause IndexOutOfBoundsException
    public static void causeIndexException() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // Invalid access, index 5 does not exist
        String value = names.get(5);
        System.out.println("Value: " + value);
    }

    //  This will cause ClassCastException
    public static void causeCastException() {
        Object number = Integer.valueOf(100);

        // Invalid cast → Integer cannot be cast to String
String value = (number instanceof String) ? (String) number : null;
        System.out.println(value);
    }

    public static void causeArrayIndex() {
        int[] numbers = {10, 20, 30};
        int value = numbers[5];
        System.out.println(value);
    }
}

