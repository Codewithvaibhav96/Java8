import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
    public static void main(String[] args) {


        List<Integer> even = List.of(2, 3, 4, 5, 6, 8, 10);
         even.stream().filter(j -> j % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------------------");
        even.forEach(number -> {

            if (number % 2 == 0) {
                System.out.println("even num>>>" + number);
            } else {
                System.out.println("odd num>>>" + number);
            }

        });



    }
}