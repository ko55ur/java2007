package course3.homework6;


import java.util.Arrays;

/*
Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException. Написать набор тестов для этого метода (по 3-4 варианта входных данных).
Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
*/
public class TestExample1 {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnArr(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7})));
        System.out.println(Arrays.toString(returnArr(new int[]{4, 2, 85, 7, 96, 5, 2, 2, 2, 1})));
        System.out.println(Arrays.toString(returnArr(new int[]{3, 2, 85, 7, 96, 4, 5, 2, 2, 2, 1})));
        System.out.println(Arrays.toString(returnArr(new int[]{1, 3, 7, 5, 2, 3, 3, 2, 7, 9, 1})));
    }

    public static int[] returnArr(int[] array) throws RuntimeException {
        if (array.length == 0)
            throw new RuntimeException("empty array");
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                if (i == array.length - 1) return new int[]{};
                int[] newArray = new int[array.length - i - 1];
                System.arraycopy(array, i + 1, newArray, 0, array.length - i - 1);
                return newArray;
            }
        }
        throw new RuntimeException("there is no 4 in the array");
    }

}
