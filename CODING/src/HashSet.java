import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSet {

    public static void main(String[] args) {



        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(45);
        list.add(3);
        list.add(6);
        list.add(0);

        TreeSet<Integer> tree= new TreeSet<>();
        tree.add(34);
        tree.add(45);
        tree.add(3);
        tree.add(6);
        tree.add(0);
        tree.addAll(list);
        System.out.println("sorting...."+tree);
        System.out.println("sorting tree...."+tree);


    }
}
