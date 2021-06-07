package ru.netology;

import java.util.concurrent.ThreadLocalRandom;

public class Market extends Thread {
    private final SumOfMarketMoney sumOfMarketMoney;

    public Market(SumOfMarketMoney sum) {
        this.sumOfMarketMoney = sum;
    }

    public void run() {
        long value = ThreadLocalRandom.current().nextLong(150, 20000);
        long[] money = {value + value * value + value * value + value};
        long sumOfMoney = 0;
        for (long moneyValue : money) {
            sumOfMoney = +moneyValue;
        }
        sumOfMarketMoney.addAdder(sumOfMoney);
    }
}
