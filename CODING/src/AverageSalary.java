import java.util.Arrays;
import java.util.List;

public class AverageSalary {
    public static void main(String[] args) {
        List<Double> salaries = Arrays.asList(50000.0, 60000.0, 70000.0, 80000.0);

        double averageSalary = salaries.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);  // Returns 0.0 if the stream is empty

        System.out.println("Average Salary: " + averageSalary);



    }
}
