package ru.netology;

import java.util.concurrent.atomic.LongAdder;

public class Tax {
    private LongAdder sums = new LongAdder();

    public void addSums(int sum) {
        sums.add(sum);
    }

    public long getAll() {
        return sums.sum();
    }
}
