import java.util.*;

public class StreamFilter {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 5, 20, 30, 6));
        numbers.stream()
               .filter(n -> n % 5 == 0)
               .forEach(System.out::println);
    }
}