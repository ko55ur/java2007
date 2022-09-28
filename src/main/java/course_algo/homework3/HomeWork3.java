package course_algo.homework3;

/*
1. Дан массив из n элементов, начиная с 1. Каждый следующий элемент равен (предыдущий + 1). Но в массиве гарантированно 1 число пропущено.
Необходимо вывести на экран пропущенное число. Постарайтесь придумать более оптимальный (асимптотически) алгоритм. Примеры:

1. [1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16] => 11
2. [1, 2, 4, 5, 6] => 3
3. [2, 3, 4, 5, 6, 7, 8] => 1
4. [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14] => 15
5. [] => 1

2. *Попробуйте реализовать двунаправленную очередь (чтобы элементы можно было добавлять и удалять не только в начало (из начала), но и в конец (с конца))

*/

public class HomeWork3 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] arr2 = {1, 2, 4, 5, 6};
        int[] arr3 = {2, 3, 4, 5, 6, 7, 8};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14};
        int[] arr5 = {};
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 13};

        System.out.println(searchSkip(arr1));
        System.out.println(searchSkip(arr2));
        System.out.println(searchSkip(arr3));
        System.out.println(searchSkip(arr4));
        System.out.println(searchSkip(arr5));
        System.out.println(searchSkip(arr6));

    }

    public static int searchSkip(int[] arr) {
        int firstArrayElement = 0;
        int lastArrayElement = arr.length - 1;
        int baseArrayElement;

        if (arr.length != 0) {
            if (arr[firstArrayElement] == 2) return 1;
        }
        while (lastArrayElement >= firstArrayElement) {
            baseArrayElement = (firstArrayElement + lastArrayElement) / 2;

            if (lastArrayElement - firstArrayElement == 1) return arr[lastArrayElement] - 1;
            if (baseArrayElement == arr[baseArrayElement] - 1) {
                firstArrayElement = baseArrayElement;
            } else if (baseArrayElement - 1 == arr[baseArrayElement - 1] - 1) {
                return arr[baseArrayElement - 1] + 1;

            } else {
                lastArrayElement = baseArrayElement;
            }
        }
        return 1;
    }

}
