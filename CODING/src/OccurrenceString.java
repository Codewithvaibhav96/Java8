import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceString {

    public static void main(String[] args) {

        String strdata="Thakare Vaibhav Ananta";
        String finddata="SpanIdea";

        Map<Character,Long> data=finddata.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<Character,Long> findata=strdata.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println(findata);




    }
}
