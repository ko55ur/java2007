package course2.lesson1;

public interface ExampleMultiInterface {

    String INTERFACE_FIELD = "ngngng";

    boolean isSomething();

    int calcSomething();

    void doSomething();

    //Java 8+
    default void defaultMethod() {

        System.out.println("Default");
    }

    //Java 9+

    static void doStatic() {
        System.out.println("Static");
    }

    //Java 9+

    private int privateCalc() {
        return 9;
    }

}
