import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithAlphabet {
    public static void main(String[] args) {

        ArrayList<String> strdata= new ArrayList<>(Arrays.asList("pragati", "vaibhav","thakare"));
        strdata.stream().filter(e-> e.startsWith("p")).collect(Collectors.toList()).forEach(System.out::println);

        ArrayList<Integer> str2 = new ArrayList<>(Arrays.asList(10,12,34,23,15));
        str2.stream().map(b-> b +"").filter(b-> b.startsWith("1")).forEach(System.out::println);

    }
}
