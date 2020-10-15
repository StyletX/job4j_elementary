package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        if (array.length == 1) {
            return 1;
        }
        int[] res = new int[array.length];
        int k = 1, j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                k++;
            } else {
                res[j] = k;
                k = 1;
                j++;
            }
        }
        res[j] = k;
        k = res[0] != 0 ? res[0] : k;
        for (int result : res) {
            k = result > k ? result : k;
        }
        return k;
    }

/*    public static void main(String[] args) {
        System.out.println(find(new int[] {1}));
        System.out.println(find(new int[] {2, 1}));
        System.out.println(find(new int[] {1, 2}));
        System.out.println(find(new int[] {1, 2, 0, 1, 2, 3}));

    }*/
}