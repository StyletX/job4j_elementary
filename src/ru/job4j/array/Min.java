package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index : array) {
            /**
             * проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
             */
            min = min > index ? index : min;
        }
        return min;
    }
}