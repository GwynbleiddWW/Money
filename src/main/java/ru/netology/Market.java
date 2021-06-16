package ru.netology;

import java.util.concurrent.ThreadLocalRandom;

public class Market extends Thread {
    private final SumOfMarketMoney sumOfMarketMoney;

    public Market(SumOfMarketMoney sum) {
        this.sumOfMarketMoney = sum;
    }

    public void run() {
        long value = ThreadLocalRandom.current().nextLong(150, 20000);
        long value1 = ThreadLocalRandom.current().nextLong(100, 15000);
        long value2 = ThreadLocalRandom.current().nextLong(250, 35000);
        long value3 = ThreadLocalRandom.current().nextLong(50, 270000);
        long value4 = ThreadLocalRandom.current().nextLong(1200, 71000);
        long[] money = {value, value1, value2, value3, value4};
        for (long l : money) {
            sumOfMarketMoney.addAdder(l);
        }
    }
}
