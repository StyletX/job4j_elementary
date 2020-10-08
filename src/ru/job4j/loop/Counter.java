package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int count = start; count <= finish; count++) {
            sum = sum + count;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int count = start; count <= finish; count++) {
            if (count % 2 == 0) {
                sum = sum + count;
            }
        }
        return sum;
    }

}
