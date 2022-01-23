package course1.lesson7;

import java.util.Arrays;

public class StringApp {


    public static void main(String[] args) {

        String str = "String";
        System.out.println(Arrays.toString(str.toCharArray()));


        String str2 = new String(str.toCharArray());


        str.toUpperCase();

        System.out.println(str + " " + str.toUpperCase());

        System.out.println(str.startsWith("S"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1).append(" ").append(2);
        String newString = stringBuilder.toString();

    }
}
