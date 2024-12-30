import java.util.List;
import java.util.Optional;

public class SecondHighSalary {
    public static void main(String[] args) {


        List<Integer> salary = List.of(2, 5, 8, 7 ,9, 8, 2, 5, 6);
        Optional<Integer> optional = salary.stream().distinct().sorted((r, t) -> t - r).skip(1).findFirst();

        Optional<Integer>optioanl=salary.stream().distinct().sorted((a,b)-> b-a).skip(1).findFirst();



          Integer  secondhigh=optional.get();

        System.out.println("Second:::" + secondhigh);

    }
}
