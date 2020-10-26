package ru.job4j.arrays;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
//		System.arrayCopy(from, fromIndex, to, toIndex, count);
        System.arraycopy(array[row], column, array[row], column + 1, array[row].length - column - 1);
        System.arraycopy(array[row], 1, array[row], 0, column);

        for (int i = 0; i < row; i++) {
            array[i][column] = array[i + 1][column];
        }
        for (int i = 0; i < array.length - row; i++) {
            array[array.length - 1 - i][column] = array[array.length - 2 - i][column];
        }
        array[row][column] = 0;

    }

}