import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ThreadPractice {

    public static void main(String[] args) {
        System.out.println("Thead started....");

        int i=20+25;

        System.out.println("Thead dead...."+i);

        List<Integer> list=List.of(1,2,3,4,5,6);

        List<Integer> even=list.stream().filter(j->  j%2==0).collect(Collectors.toList());
        System.out.println(even);

        list.forEach(num->{

            if(num %2==0)
            {
                System.out.println("Even----"+num);
            }else{
                System.out.println("ODD----"+num);
            }
        });



        Integer min=list.stream().min((k,v)-> k.compareTo(v)).get();
        System.out.println(min);

        Integer max=list.stream().max((p,v)-> p.compareTo(v)).get();
        System.out.println(max);

        List<String> data = List.of("vaibhav", "pragati", "thakare");
        data.stream().forEach(System.out::println);

    data.stream().filter(e-> e.startsWith("v")).collect(Collectors.toList()).forEach(System.out::println);

        //System.out.println(startWithV);

        Optional<Integer> optional=list.stream().distinct().sorted((a, b)-> b-a).skip(1).findFirst();

Integer secondhigh=optional.get();

        System.out.println(secondhigh);












    }




}
