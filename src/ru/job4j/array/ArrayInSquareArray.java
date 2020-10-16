package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size  = (int) Math.ceil(Math.sqrt(array.length));
        int[][] rst = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i * size + j) < array.length) {
                    rst[i][j] = array[i * size + j];
                } else {
                    rst[i][j] = 0;
                }
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        convertArray(new int[]{1, 2, 3, 4, 5, 6, 7});
    }
}