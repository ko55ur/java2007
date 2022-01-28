package course1.homework3;

import java.util.Arrays;

public class HomeWorkApp3 {


    public static void main(String[] args) {

        System.out.println("Задание 1");

        int[] iArr = {1, 0, 1, 0, 1, 0, 1, 0};
        {
            for (int i = 0; i < iArr.length; i++) {
                if (iArr[i] == 0) {
                    iArr[i] = 1;
                } else {
                    iArr[i] = 0;
                }
            }
            System.out.println(Arrays.toString(iArr));
        }
        System.out.println("---");
        System.out.println("Задание 2");
        int[] nArr = new int[100];
        {
            for (int i = 0; i < nArr.length; i++) {
                nArr[i] = i + 1;
            }
            System.out.println(Arrays.toString(nArr));
        }
        System.out.println("---");
        System.out.println("Задание 3");
        int[] cArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            for (int i = 0; i < cArr.length; i++) {
                if (cArr[i] < 6) {
                    cArr[i] *= 2;
                }
            }
            System.out.println(Arrays.toString(cArr));
        }
        System.out.println("---");
        System.out.println("Задание 4");
        int[][] dArr = new int[6][6];
        {
            for (int i = 0; i < dArr.length; i++) {
                for (int j = 0; j < dArr[i].length; j++)
                    if ((i == j) || (j == dArr.length - i - 1)) {
                        dArr[i][j] = 1;
                    } else dArr[i][j] = 0;
                System.out.println(Arrays.toString(dArr[i]));
            }
        }

        System.out.println("---");
        System.out.println(Arrays.toString(arrMethod(6, 10)));

        System.out.println("---");
        System.out.println("Задание 6");

        int[] mArr = {-300, 56, 767, 123, 6778, -2132, 566};
        {
            int minVal = mArr[0];
            int maxVal = mArr[0];
            for (int j : mArr) {
                if (maxVal < j) maxVal = j;
                if (minVal > j) {
                    minVal = j;
                }
            }
            System.out.println(maxVal);
            System.out.println(minVal);
        }


    }

    public static int[] arrMethod(int len, int initialValue) {

        System.out.println("Задание 5");

        int[] rArr = new int[len];
        for (int i = 0; i < len; i++) {
            rArr[i] = initialValue;
        }
        return rArr;

    }
}


