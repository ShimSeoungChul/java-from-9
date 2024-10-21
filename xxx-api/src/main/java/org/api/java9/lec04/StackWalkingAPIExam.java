package org.api.java9.lec04;

import java.util.List;

public class StackWalkingAPIExam {
    public static void main(String[] args) {
        callA();
    }

    private static void callA() {
        callB();
    }

    private static void callB() {
        callC();
    }

    private static void callC() {
        List<String> walk = StackWalker.getInstance()
                .walk(s -> s.map(StackWalker.StackFrame::getMethodName).toList());

        walk.forEach(System.out::println);
    }
}
