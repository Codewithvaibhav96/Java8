



public interface MultipleInheritanceA {

    void methodA();
    default void methodD()
    {
        System.out.println("Default method.....A");
    }
}
