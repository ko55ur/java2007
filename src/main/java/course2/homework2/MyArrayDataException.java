package course2.homework2;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j, String value, Throwable caused) {

        super(String.format("Not correct data %s in cell [%d][%d]", value, i, j), caused);
    }
}
