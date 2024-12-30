import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        //flatMap
        List<List<Integer>> flatdata= Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(5,6,7),
                Arrays.asList(8,9,8));
        List<Integer> flatted=flatdata.stream().flatMap(i-> i.stream()).collect(Collectors.toList());
        System.out.println("flatMap data:" +flatted);

        //Map
        List<String> upper=List.of("vaibhav");
        List<String> uppercase=upper.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("toUpperCase data:" +uppercase);


        List<List<String>> listdata=Arrays.asList
                (Arrays.asList("vaibhav","pragati","pune"),
                Arrays.asList("rahul","ananta","thakare"),
                        Arrays.asList("gaytri","pragati","belad"));


        List<String> arraydata=listdata.stream().flatMap(filter-> filter.stream()).collect(Collectors.toList());
        System.out.println("flatMap data String---:" +arraydata);

        arraydata.stream().filter(s-> s.startsWith("p")).collect(Collectors.toList()).forEach(System.out::println);



    }
}
