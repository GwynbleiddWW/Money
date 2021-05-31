package ru.netology;

import java.util.concurrent.ThreadLocalRandom;

public class Market extends Thread {
    private final SumOfMarketMoney sumOfMarketMoney;

    public Market(SumOfMarketMoney sum) {
        this.sumOfMarketMoney = sum;
    }

    public void run() {
        long value = ThreadLocalRandom.current().nextLong(150, 1500);
        long sumOfMoney = value + value * value + value * value;
        sumOfMarketMoney.addAdder(sumOfMoney);
    }
}
