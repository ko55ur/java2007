public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(src(11, 19));
        System.out.println(posNeg(-1));
    }

    public static boolean src(int a, int b) {
        boolean summa = (a + b >= 10 && a + b <= 20);
        return summa;
    }
    public static int posNeg(int c) {
        if (c >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
        return null;
    }
}
