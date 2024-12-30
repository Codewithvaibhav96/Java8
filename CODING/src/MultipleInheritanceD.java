


public interface MultipleInheritanceD extends MultipleInheritanceA,MultipleInheritanceB {
    void methodFinal();

    @Override
    default void methodA() {

    }

    @Override
    default void methodD() {
        MultipleInheritanceA.super.methodD();
    }

    @Override
    default void methodB() {

    }
}
