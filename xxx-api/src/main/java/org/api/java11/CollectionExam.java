package org.api.java11;

import java.util.Arrays;
import java.util.List;

public class CollectionExam {
    public static void main(String[] args) {
        // toArray() 메서드에 배열 생성자 참조를 사용할 수 있게 됨.
        // ASIS
        List<String> strs = List.of("A", "B", "C");
        String[] strArray = new String[3];
        String[] result = strs.toArray(strArray);
        Arrays.stream(result).forEach(System.out::println);

        // TOBE
        String[] result2 = strs.toArray(String[]::new);
        Arrays.stream(result2).forEach(System.out::println);
    }
}
