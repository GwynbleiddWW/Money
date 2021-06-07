package ru.netology;

public class Main {

    public static void main(String[] args) throws Exception {
        SumOfMarketMoney sumOfMarketMoney = new SumOfMarketMoney();

        new Market(sumOfMarketMoney).start();
        new Market(sumOfMarketMoney).start();
        new Market(sumOfMarketMoney).start();

        Thread.sleep(2000);
        System.out.println("Общая выручка магазинов: " + sumOfMarketMoney.sumAdder() + " руб.");
    }
}
