package course2.homework2;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.

 */
public class HomeWorkApp2 {

    private final static int SIZE = 4;

    public static void main(String[] args) {

        String[][] testArr1 = {

                {"1", "2", "3", "4"},
                {"-8", "7", "-9", "5"},
                {"11", "12", "53", "74"},
                {"16", "22", "-38", "45"}
        };
        String[][] testArr2 = {

                {"1", "2", "3", "4"},
                {"8", "7", "9", "5"},
                {"11", "12", "53", "74"}
        };
        String[][] testArr3 = {

                {"1", "2", "3", "4"},
                {"8", "7", "9", "5"},
                {"11", "12", "53"},
                {"16", "22", "38", "45"}
        };
        String[][] testArr4 = {

                {"1", "2", "3", "4"},
                {"8", "7", "9", "5"},
                {"11", "12", "fsdgfdsf", "74"},
                {"16", "22", "38", "45"}
        };
        try {
            System.out.println("Sum Arr1" + calcArrSum(testArr1));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex);
        }
        try {
            System.out.println("Sum Arr2" + calcArrSum(testArr2));
        } catch (MyArrayDataException | MyArraySizeException ex) {
            System.out.println(ex);
        }

        try {
            System.out.println("Sum Arr3" + calcArrSum(testArr3));
        } catch (MyArrayDataException | MyArraySizeException ex) {
            System.out.println(ex);
        }
        try {
            System.out.println("Sum Arr4" + calcArrSum(testArr4));
        } catch (MyArrayDataException | MyArraySizeException ex) {
            System.out.println(ex);
        }

    }

    public static int calcArrSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int result = 0;
        if (arr.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new MyArraySizeException();
            }

            for (int j = 0; j < arr[i].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j, arr[i][j], ex);
                }
            }

        }
        return result;
    }

}
