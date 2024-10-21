package org.api.java9.lec02;

import org.domain.Lec02Person;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Lec02Person p = new Lec02Person();

        // private 변수에 접근할 수 있도록 접근을 허가
        Class<Lec02Person> personClass = Lec02Person.class;
        Field weight = personClass.getDeclaredField("weight");
        weight.setAccessible(true);

        // 몸무게를 100으로 변경
        weight.set(p, 100);
        System.out.println("weight: " + p.getWeight());
    }
}
