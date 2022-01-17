package course1.lesson3;

public class ArrApp {

    public static void main(String[] args) {

        int size = 6;
        int size2 = 6;


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                if (i == 2 || i == 3 || j == 2 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }
}
