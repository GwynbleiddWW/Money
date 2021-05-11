package ru.netology;

public class Main {
    private static final int MAX_SUPERMARKETS = 3;

    public static void main(String[] args) throws InterruptedException {

        Tax tax = new Tax();

        for (int i = 0; i < MAX_SUPERMARKETS; i++) {
            new Count(tax).start();
        }
        System.out.println(tax.getAll());
    }
}
