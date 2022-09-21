package course_algo.homework2;

public class SelectionSort {
    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }

            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;

        }
    }
}
