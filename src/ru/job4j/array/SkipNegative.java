package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                array[row][cell] = array[row][cell] < 0 ? 0 : array[row][cell];
                }
        }
        return array;
    }
}