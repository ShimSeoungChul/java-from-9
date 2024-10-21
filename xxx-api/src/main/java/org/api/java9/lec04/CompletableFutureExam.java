package org.api.java9.lec04;

import java.util.concurrent.*;

public class CompletableFutureExam {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Java9의 CompletableFuture API 기능 추가

        // 1.Timeout 관련 기능 추가
        runTimeoutFunctions();

        // 2.지연 기능 추가
        runDelayFunctions();
    }

    private static void runDelayFunctions() {
        Executor executor = CompletableFuture.delayedExecutor(5, TimeUnit.SECONDS);
        Runnable sleep = () -> {
            System.out.println(System.currentTimeMillis() + " - 작업 완료");
        };

        System.out.println(System.currentTimeMillis() + " - delayedExecutor 작업 실행");
        CompletableFuture<Void> future = CompletableFuture.runAsync(sleep, executor);

        future.join();
    }

    private static void runTimeoutFunctions() throws ExecutionException, InterruptedException {
        Runnable sleep = () -> {
            try {
                Thread.sleep(10_000L);
                System.out.println(System.currentTimeMillis() + " - 작업 완료");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // 1. orTimeout
        System.out.println(System.currentTimeMillis() + " - orTimeout 작업 실행");
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            sleep.run();
            return "SUCCESS";
        }).orTimeout(1, TimeUnit.SECONDS);

        // TimeoutException 확인을 위해 실행한 비동기 작업이 완료될 때까지 현재 스레드를 멈춤
        //future.get();

        // 2. completeOnTimeout
        System.out.println(System.currentTimeMillis() + " - completeOnTimeout 작업 실행");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            sleep.run();
            return "SUCCESS";
        }).completeOnTimeout("FAIL", 1, TimeUnit.SECONDS);
        System.out.println("future2: " + future2.get());

        future2.get();
    }
}
