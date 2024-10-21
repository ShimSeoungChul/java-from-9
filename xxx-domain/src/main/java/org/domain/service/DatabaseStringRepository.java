package org.domain.service;

public class DatabaseStringRepository implements StringRepository {
    @Override
    public void save(String newString) {
        System.out.println("문자열 데이터베이스 저장");
    }
}
