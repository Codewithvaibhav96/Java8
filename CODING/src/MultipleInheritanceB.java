public interface MultipleInheritanceB {

    void methodB();
    default  void methodD()
    {
        System.out.println("Default method.....B");
    }
}
