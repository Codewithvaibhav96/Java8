import java.util.List;
import java.util.stream.Collectors;

public class SquareJava8 {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(2,5,6,7);
        List<Integer> num12= numbers.stream().map(p-> p*p*p).collect(Collectors.toList());
        System.out.println("Square data:" +num12);

    }



}
