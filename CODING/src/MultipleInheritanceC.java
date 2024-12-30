public class MultipleInheritanceC implements MultipleInheritanceA,MultipleInheritanceB{


    public void methodA() {
        System.out.println("MultipleInheritanceA");
    }

    @Override
    public void methodD() {
        System.out.println("Overriden method in  interface B");
    }


    public void methodB() {
        System.out.println("MultipleInheritanceB");
    }


}
