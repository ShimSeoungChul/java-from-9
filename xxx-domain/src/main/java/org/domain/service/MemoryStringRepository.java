package org.domain.service;

import java.util.ArrayList;
import java.util.List;

public class MemoryStringRepository implements StringRepository {
    private final List<String> strings = new ArrayList<>();

    @Override
    public void save(String newString) {
        strings.add(newString);
        System.out.println("문자열 메모리 저장");
    }
}
