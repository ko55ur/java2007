public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(summaOfNumbers(11, 9));
        posNeg(-20);
        System.out.println(posOrNeg(-20));
        printTextNTimes("Методы", 3);
        System.out.println(leapOrNotLeap(2040));
    }

    public static boolean summaOfNumbers(int fNumber, int sNumber) {
        return (fNumber + sNumber >= 10 && fNumber + sNumber <= 20);
    }

    static void posNeg(int c) {
        if (c >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean posOrNeg(int number) {
        return (number < 0);
    }

    public static void printTextNTimes(String textForString, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(textForString);
        }
    }

    public static boolean leapOrNotLeap(int year) {
        int everyNotLeap = 100, everyLeap = 400, leapYear = 4;
        return (year % leapYear == 0) && ((year % everyNotLeap != 0) || (year % everyLeap == 0));
    }
}
