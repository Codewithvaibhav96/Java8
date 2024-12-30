import java.util.Arrays;
import java.util.List;


import java.util.stream.Collectors;

public class Cap {


    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple", "banana", "madam", "racecar", "apple", "kiwi");

            List<String> result = items.stream()
                    .distinct() // Remove duplicates
                    .filter(item -> !isPalindrome(item)) // Filter out palindromes
                    .collect(Collectors.toList());

              List<String> resultDublicate= items.stream()
                      .distinct()
                      .collect(Collectors.toList());

            System.out.println(result); // Output: [apple, banana, kiwi]
            System.out.println(resultDublicate);// OutPut dublicate remove


    }

       private static boolean isPalindrome(String s) {
            String reversed = new StringBuilder(s).reverse().toString();
            return s.equals(reversed);
        }


}