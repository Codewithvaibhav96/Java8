import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {

    public static void main(String[] args) {


        String s1="vaibhavthakare";
        String [] data= s1.split("");


        Map<String, Long> collect = Arrays.stream(data).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Data format"+collect);


        Optional<String> optional= Optional.of("");

        optional.ifPresent(System.out::println);


    }
}
