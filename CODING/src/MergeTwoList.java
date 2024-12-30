import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoList {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("vaibhav", "pragati", "thakare"));
        ArrayList<String> num = new ArrayList<>(Arrays.asList("vaibhav", "pragati", "thakare"));
        str.addAll(num);
        System.out.println("String data:" + str);

      ArrayList<String> str1=new ArrayList<>(Arrays.asList("pune","hinjewadi"));
      ArrayList<String> str2= new ArrayList<>(Arrays.asList("auto","malkapur"));

      str1.addAll(str2);
        System.out.println("String data:" + str1);


    }
}
