package course3.homework6;


/*
Написать метод, который проверяет состав массива из чисел 1 и 4.
Если в нем нет хоть одной четверки или единицы, то метод вернет false;
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
*/
public class TestExample2 {
    public static void main(String[] args) {
        System.out.println(isOneOrFour(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}));
        System.out.println(isOneOrFour(new int[]{4, 1, 1, 1, 1, 1, 4, 4, 4, 1}));
        System.out.println(isOneOrFour(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(isOneOrFour(new int[]{1, 1, 4, 4, 1}));
    }

    public static boolean isOneOrFour(int[] array) {
        boolean presentOne = false;
        boolean presentFour = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                presentOne = true;
            } else if (array[i] == 4) {
                presentFour = true;
            } else {
                return false;
            }

        }
        return presentOne && presentFour;
    }

}
