package org.api.java9.lec04;

import java.util.List;
import java.util.stream.Stream;

public class StreamExam {
    public static void main(String[] args) {
        // Java9의 Stream 기능 추가
        // 1. takeWhile
        // 15 뒤에도 3도 10이하지만, 15가 나오는 순간 뒤의 값은 모두 버림
        List<Integer> takeWhileList = Stream.of(10, 5, 15, 3, 20)
                .takeWhile(num -> num <=10)
                .toList();
        System.out.println("takeWhile: " + takeWhileList);

        // 2. dropWhile
        // 10, 5는 버리고 15가 나오는 순간 뒤의 데이터를 모두 남김
        List<Integer> dropWhileList = Stream.of(10, 5, 15, 3, 20)
                .dropWhile(num -> num <=10)
                .toList();
        System.out.println("dropWhile: " + dropWhileList);

        // 3. ofNullable
        Stream<Object> nullableStream = Stream.ofNullable("ABC");
        System.out.println("ofNullable: " + nullableStream.toList());

        // 4. iterate
        // ASIS: 실수로 limit을 빠뜨리면, 무한 스트림 가능
        Stream.iterate(0, i -> i +2)
                .limit(5)
                .forEach(System.out::println);
        // TOBE: 전통적인 for문과 유사한 방식으로 무한 스트림 방지
        Stream.iterate(0, i -> i < 10, i -> i + 2)
                .forEach(System.out::println);

    }
}
