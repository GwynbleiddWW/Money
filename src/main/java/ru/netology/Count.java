package ru.netology;

import java.util.Arrays;

import static java.util.concurrent.ThreadLocalRandom.current;

public class Count extends Thread {
    private Tax tax;

    public Count(Tax tax) {
        this.tax = tax;
    }

    public void run() {
        int minSize = current().nextInt(100, 1000);
        int maxSize = current().nextInt(1000, 5000);
        int value = current().nextInt(minSize, maxSize);
        int[] money = {value, value * 2, value * 10};
        int sum = Arrays.stream(money).sum();
        System.out.println(sum);
        tax.addSums(sum);
    }
}
