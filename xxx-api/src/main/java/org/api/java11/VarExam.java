package org.api.java11;

import java.util.function.Consumer;

public class VarExam {
    public static void main(String[] args) {
        // String 타입을 명시적으로 작성해 준 람다식
        Consumer<String> c1 = (String x) -> System.out.println(x);

        // 자바 11부터 람다식에 var을 사용할 수 있음
        Consumer<String> c2 = (var x) -> System.out.println(x);

        // 타입을 명시해야 애너테이션을 붙일 수 있음.
        Consumer<String> c3 = (@Deprecated var x) -> System.out.println(x);
    }
}
