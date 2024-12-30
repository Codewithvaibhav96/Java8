public class SingletoneMain {
    public static void main(String[] args) {
        Singletone instance = Singletone.getInstance();
        System.out.println(instance.hashCode());
        Singletone instance2 = Singletone.getInstance();
        System.out.println(instance2.hashCode());

    }
}
