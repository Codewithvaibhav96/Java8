import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Java8DateAndTime {


    public static void main(String[] args) {

        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);


        CompletableFuture.supplyAsync(()-> "vaibhav")
                .thenApply(result-> result+ "pragati")
                .thenAccept(System.out::println);

        List<Integer> integerList= Arrays.asList(2,3,4,5);

        int sum = integerList.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);







    }
}
