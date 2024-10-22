package org.api.java10;

import java.util.Optional;

public class OptionalExam {
    public static void main(String[] args) {
        Optional.ofNullable(3)
                .orElseThrow();
    }
}
