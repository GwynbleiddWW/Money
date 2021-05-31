package ru.netology;

import java.util.concurrent.atomic.LongAdder;

public class SumOfMarketMoney {
    private final LongAdder adder = new LongAdder();

    public void addAdder(long sumOf){
        adder.add(sumOf);
    }

    public long sumAdder(){
        return adder.sum();
    }
}
