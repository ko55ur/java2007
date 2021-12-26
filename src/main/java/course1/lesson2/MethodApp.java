package course1.lesson2;

public class MethodApp {
    public static final String TEMPLATE = "int = %d string = %s\n";

    public static void main(String[] args) {

       int v1 = multiplication(4, 10);
       int v2 = multiplication(5, 6);
       int v3 = multiplication(v1, v2);


        System.out.println("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));

        PrintUtil.printFormatted("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2 ));

        PrintUtil.printFormatted("string to format");

        System.out.printf(TEMPLATE, 10, "str");
        System.out.println();
        System.out.printf(TEMPLATE, 113, "str1662363");
    }

    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }
    public static int multiplication(double n1, int n2) {
        return (int) (n1 * n2);
    }
    public static int multiplication(double n1, double n2) {
        return (int) (n1 * n2);
    }
}
