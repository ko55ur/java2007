package course2.homework3;

import java.util.*;

public class WordFind {

    public static void main(String[] args) {
        String[] arr = {
                "привет",
                "пока",
                "hello",
                "bye",
                "привет",
                "hello",
                "bye",
                "stratum",
                "привет",
                "run",
                "stop",
                "start",
                "post",
                "stratum"
        };

        Set strSet = new HashSet(Arrays.asList(arr));
        System.out.println("List of words " + strSet);

        Map<String, Integer> wordFind = new HashMap<>();
        for (String str : arr) {
            int cnt = 0;
            for (String str1 : arr) {
                if (str.equals(str1)) {
                    cnt++;
                }
            }
            wordFind.put(str, cnt);
        }

        wordFind = new HashMap<>();
        for (String str : arr) {
            wordFind.putIfAbsent(str, 0);
            int cnt = wordFind.get(str);
            wordFind.put(str, cnt + 1);

        }

        System.out.println("Number of repeated words " + wordFind);
    }

}
