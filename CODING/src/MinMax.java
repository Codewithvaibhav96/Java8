import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> salary = List.of(10000, 20000, 30000, 40000);
        Integer java = salary.stream().min((p, v) -> p.compareTo(v)).get();
        System.out.println("No min" + java);

        Integer py = salary.stream().max((c, v) -> c.compareTo(v)).get();
        System.out.println("No max" + py);

        List<Integer> data=Arrays.asList(23,34,56,78,87);
        Integer demo=data.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("No min" +demo);

        List<Integer> dat=Arrays.asList(23,34,56,78,87);
        Integer fro=dat.stream().max((t,y)-> t.compareTo(y)).get();
        System.out.println("No min" +fro);

    }
}
