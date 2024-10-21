package org.api.java10.lec6;

import java.util.Map;

public class VarExam {
    public static void main(String[] args) {
        var num = 3;
        num = 10;
        // num = "ABC"; // 오류 발생

        Map<String, String> map = Map.of("A", "B");
        var map2 = Map.of("A", "B");
    }
}
