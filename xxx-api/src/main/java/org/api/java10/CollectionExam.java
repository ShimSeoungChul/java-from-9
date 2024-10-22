package org.api.java10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionExam {
    public static void main(String[] args) {
        // Java10의 Collection 기능 추가
        // 1. copyOf
        List<Integer> oldNums = new ArrayList<>(List.of(1, 2, 3));  // 수정 가능한 리스트로 변환
        List<Integer> newNums = List.copyOf(oldNums);
        oldNums.add(4);

        oldNums.forEach(num -> System.out.println("old : " + num));   // 1, 2, 3, 4
        newNums.forEach(num -> System.out.println("new : " + num));   // 1, 2, 3

        List<Integer> oldNums2 = new ArrayList<>(List.of(1, 2, 3));  // 수정 가능한 리스트로 변환
        List<Integer> newNums2 = Collections.unmodifiableList(oldNums2);
        oldNums2.add(4);

        oldNums2.forEach(num -> System.out.println("old2 : " + num));   // 1, 2, 3, 4
        newNums2.forEach(num -> System.out.println("new2 : " + num));   // 1, 2, 3, 4

        // 2. Collectors.toUnmodifiableList
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
    }
}
