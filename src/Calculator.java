import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        causeIndexException();
        causeCastException();
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

    // ❌ This will cause ClassCastException
    public static void causeCastException() {
        Object number = Integer.valueOf(100);

        // Invalid cast → Integer cannot be cast to String
        String value = (String) number;
        System.out.println(value);
    }
}


