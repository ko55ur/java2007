
package course1.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TaskApp {
    public static void main(String[] args) {
        //Задача
        //Дан массив целых чисел. Требуется удалить все неуникальные значения, кроме последнего
        //[3, 4, 5, 3, 5, 6] -> [4, 3, 5, 6]
        //[3, 4, 5, 3, 5, 3] -> [4, 5, 3]

        System.out.println(Arrays.toString(getNewArray2(new int[]{3, 4, 5, 3, 5, 6})));
        System.out.println(Arrays.toString(getNewArray2(new int[]{3, 4, 5, 3, 5, 3})));

        List<Integer> list= Arrays.asList(new Integer[]{3, 4, 5, 3, 5, 6});
        Collections.reverse(list);
        System.out.println(list.stream().distinct().collect(Collectors.toList()));


    }

    public static void reverseArray(int[] array) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }


    public static Integer[] getNewArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = array.length - 1; i >= 0; i--) {
            if (!list.contains(array[i])) {
                list.add(array[i], 0);
            }
        }
        return list.toArray(new Integer[0]);
    }

    public static int[] getNewArray2(int[] array) {
        int[] result = new int[0]; //TBD
        for (int i = array.length - 1; i >= 0; i--) {
            result = addValue(result, array[i]);
        }
        return result;
    }

    //[] 6 -> [6]
    //[5,6] 5 -> [5, 6]
    //[5,6] 3 -> [3, 5, 6]
    public static int[] addValue(int[] array, int value) {
        if (arrayContainsValue(array, value)) {
            return array;
        }
        int[] result = new int[array.length + 1];
        result[0] = value;
        for (int i = 0; i < array.length; i++) {
            result[i + 1] = array[i];
        }
        return result;

    }

    /**
     * Проверка что массив содержит значение
     *
     * @param array
     * @param value
     * @return
     */
    public static boolean arrayContainsValue(int[] array, int value) {
        for (int arr : array) {
            if (arr == value) {
                return true;
            }
        }
        return false;
    }


}
