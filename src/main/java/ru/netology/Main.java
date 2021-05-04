package ru.netology;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LongAdder stat = new LongAdder();

        Tax tax = new Tax();

        ThreadGroup tg = new ThreadGroup("Supermarket");
        Thread one = new Thread(tg, () -> tax.generateTax(12, 25, 8), "Sum1");
        Thread two = new Thread(tg, () -> tax.generateTax(16, 26, 2), "Sum2");
        Thread three = new Thread(tg, () -> tax.generateTax(15, 24, 3), "Sum3");
        one.start();
        two.start();
        three.start();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        //executorService.submit(); ?
        executorService.shutdown();
        System.out.println("\nРезультат: " + stat.sum());
    }
}
