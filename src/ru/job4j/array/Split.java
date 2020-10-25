package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int i = 0, j = 0;
        for (int k = 0; k <= str.length; k++) {
            if ((k == str.length) || (str[k] == c)) {
                result[i] = new char[k - j];
                result[i] = Arrays.copyOfRange(str, j, k);
                j = k + 1;
                i++;
            }
        }

        return Arrays.copyOf(result, i);
    }
}
