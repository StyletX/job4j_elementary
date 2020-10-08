package ru.job4j.loop;

public class Factorial {
    public static int calcF(int n) {
        int result = 1;
            for (int count = 1; count <= n; count++) {
                result = result * count;
            }
        return result;
    }
}