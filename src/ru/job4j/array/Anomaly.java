package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int count = 0, coln = 0;
        for (int i = 0; i < data.length; i++) {
            if ((data[i] <= down) || (data[i] >= up)) {
                result[count][coln++] = i;
                if (coln == 2) {
                    coln = 0;
                    count++;
                }
            }
        }
        if ((count == 0) && (coln == 1)) {
            result[0][1] = result[0][0];
            count++;
        }
        return Arrays.copyOf(result, count);
    }
}
