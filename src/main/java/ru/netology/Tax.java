package ru.netology;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.stream.IntStream;

public class Tax extends Thread {
    public void generateTax(int minSize, int maxSize, int size) {
        int value = ThreadLocalRandom.current().nextInt(minSize, maxSize);
        int[] data = IntStream.generate(() -> value).limit(size).toArray();
        System.out.println(Arrays.toString(data));
    }
}
