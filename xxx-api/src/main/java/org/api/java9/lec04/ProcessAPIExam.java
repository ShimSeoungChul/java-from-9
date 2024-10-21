package org.api.java9.lec04;

public class ProcessAPIExam {
    public static void main(String[] args) {
        // 지금 실행하는 java process의 PID를 가져와 출력
        System.out.println("PID: " + ProcessHandle.current().pid());
    }
}
