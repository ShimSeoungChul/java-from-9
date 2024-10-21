package org.api.java9.lec05;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CoffeeSubscriber subscriber = new CoffeeSubscriber();
        CoffeePublisher publisher = new CoffeePublisher();

        publisher.subscribe(subscriber);

        // 위 코드 실행 과정을 위해 Main 스레드를 5초간 대기
        Thread.sleep(5_000L);
    }
}
