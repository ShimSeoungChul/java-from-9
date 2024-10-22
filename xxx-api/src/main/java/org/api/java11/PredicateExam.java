package org.api.java11;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExam {
    public static void main(String[] args) {
        // Predicate.not() 메서드를 사용할 수 있게 됨.
        List<String> strings = List.of("A", " ", "  ");

        List<String> result = strings.stream()
                .filter(Predicate.not(String::isBlank))
                .toList();
    }
}
