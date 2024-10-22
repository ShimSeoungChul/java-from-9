package org.api.java11;

public class StringExam {
    public static void main(String[] args) {
        // 1. whitespace를 제거하는 함수 추가
        // strip()
        String str = "    A BC ";
        System.out.println(str.strip());    // "A BC"

        // stripLeading()
        System.out.println(str.stripLeading());    // "A BC "

        // stripTrailing()
        System.out.println(str.stripTrailing());    // "    A BC"

        // 2. isBlank() 함수 추가
        String str2 = " ";
        System.out.println(str2.isBlank());    // true

        // 3. lines() 함수 추가
        String str3 = "A\nB\nC";
        str3.lines().forEach(System.out::print);  // ABC
        System.out.println();

        // 4. repeat() 함수 추가
        String str4 = "=".repeat(10);
        System.out.println(str4);    // "=========="
    }
}
