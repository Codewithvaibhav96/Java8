import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;




public class Transactional {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("vaibhav", "ram", "vaibhav", "ram", "Global","ram");

        Map<String, Long> mapdata = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() >= 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(mapdata);


    }
}
