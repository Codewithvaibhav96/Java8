import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

public static void main(String[] args) {
      System.out.println("Starting....");
      // Addition
      SumInter sum1 = (a, b) -> a + b;
      //System.out.println(sum1.(20, 20));



      SumInter data=(x,y)-> x*y;

   // System.out.println(data.multiply(10,10));



      // String
       Length ln = (str -> String.valueOf(str.length()));
      System.out.println(ln.getlength("vaibhav"));

      //List creation
      List<Integer> list = List.of(12, 16, 18, 2, 6, 11);
      System.out.println(list);












































     }
}



