package ru.netology;

public class Main {

    public static void main(String[] args) throws Exception {
        SumOfMarketMoney sumOfMarketMoney = new SumOfMarketMoney();

        Thread market1 = new Market(sumOfMarketMoney);
        Thread market2 = new Market(sumOfMarketMoney);
        Thread market3 = new Market(sumOfMarketMoney);

        market1.start();
        market1.join();
        market2.start();
        market2.join();
        market3.start();
        market3.join();

        System.out.println("Общая выручка магазинов: " + sumOfMarketMoney.sumAdder() + " руб.");
    }
}
