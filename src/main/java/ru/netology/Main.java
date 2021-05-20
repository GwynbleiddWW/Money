package ru.netology;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;

public class Main {

    public static void main(String[] args) {
        LongAdder adder = new LongAdder();
        int marketCount = 3;
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < marketCount; i++)
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    int value = ThreadLocalRandom.current().nextInt(150, 1500);
                    adder.add(value);
                    adder.add(value * 2L);
                    adder.add(value * 10L);
                    System.out.println(adder);
                }
            });

        executor.execute(() -> {
            System.out.println("Выручка: " + adder.sum() + " рублей.");
        });
        executor.shutdown();
    }
}
