package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        amount = (int) (amount * (1 + percent * 0.01));
        while (amount  > salary) {
            year++;
            amount -= salary;
        }
        return year;
    }
}