package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        for (int i = 1; i <= count; i++) {
            triangle[i - 1] = new int[i];
        }
        int k = 1;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = k;
                k++;
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        rows(2);
    }
}