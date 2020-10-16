package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            size += array[i].length;
        }
        size  = (int) Math.ceil(Math.sqrt(size));
        int[][] res = new int[size][size];
        int r = 0, s = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i <= array.length - 1) && (j <= array[i].length - 1)) {
                    res[r][s] = array[i][j];
                    if (s < size - 1) {
                        s++;
                    } else {
                        s = 0;
                        r++;
                    }
                }

            }
        }
        return res;
    }
}