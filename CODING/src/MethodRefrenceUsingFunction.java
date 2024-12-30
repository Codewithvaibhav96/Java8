import java.util.List;

public class MethodRefrenceUsingFunction {
    public static void main(String[] args) {
        List<String> data = List.of("vaibhav", "pragati", "thakare");
        data.stream().forEach(System.out::println);
    }
}
