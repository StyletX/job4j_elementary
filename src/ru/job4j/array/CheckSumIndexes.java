package ru.job4j.array;

import java.util.ArrayList;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        ArrayList<Integer> data2 = new ArrayList<>();
        //int[] data2 = new int[];
        //int n = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    data2.add(data[i][j]);
                    //        	n++;
                }
            }
        }
        Integer[] arr = data2.toArray(new Integer[data2.size()]);

        int[] array2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            array2[i] = arr[i];
        }

        return array2;
    }
}