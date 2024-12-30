import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingAndDescendingOrder {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(16, 2, 43, 4, 85, 6, 87);
        //Asending
        list1.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
            System.out.println("-----------------");
        //Deceding
        list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);


    }
}
