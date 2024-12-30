import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Data {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String>data=names.stream().filter(name-> name.startsWith("D")).collect(Collectors.toList());
        System.out.println(data);

        ArrayList<String> list= new ArrayList<>(Arrays.asList("vaibhav","pragati","pune"));

        list.stream().filter(r->r.startsWith("p")).collect(Collectors.toList()).forEach(System.out::println);
    }

}
