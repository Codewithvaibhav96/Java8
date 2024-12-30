import java.util.List;

public class StartAndEndWithSame {


    public static void main(String[] args) {

        List<String> list=List.of("abc","mnm","xlx","fkf","qwe");
        list.stream().filter(a-> a.length()>0 && a.endsWith(String.valueOf(a.charAt(0)))).forEach(System.out::println);





    }


}
