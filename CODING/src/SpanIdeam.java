import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class SpanIdeam {

    public static void main(String[] args) {

        //Find the second highest element

        //2, 5, 8, 7 ,9, 8, 2, 5, 6

    int [] numbers={2, 5, 8, 7 ,9, 8, 2, 5, 6};

    Set<Integer> uniqueNumbers= new HashSet<> ();
    for(int number : numbers){

        uniqueNumbers.add(number);
        //Arrays.sort(sortedUniqueNumbers);

    }
    Integer[] sortedUniqueNumbers= uniqueNumbers.toArray(new Integer[0]);
    Arrays.sort(sortedUniqueNumbers);

    if(sortedUniqueNumbers.length>=2)
    {
        int secondHigh=sortedUniqueNumbers[sortedUniqueNumbers.length-2];
        System.out.println("Second High value---"+secondHigh);
    }
    else{
        System.out.println("Not second highest value in list");
    }

    }
}
