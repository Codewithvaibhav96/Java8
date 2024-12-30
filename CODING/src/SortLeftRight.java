

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
public class SortLeftRight {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 12, 13, 0, 19, 0);
        Map<Boolean,List<Integer>> partition=numbers.stream().collect(Collectors.partitioningBy(num->Integer.toString(num).startsWith("0")));


        List<Integer> leftPart= partition.get(true);
        List<Integer> rightside= partition.get(false);

        System.out.println("Left side startwith o"+leftPart);
        System.out.println("Left side startwith o"+rightside);





    }





}
