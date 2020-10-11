package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        //short[] ages = new short[10];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Вася Пупкин";
        names[2] = "Иван Сидоров";
        names[3] = "Сергей Николаев";
        //float[] prices = new float[40];

        for (int i = 0; i <= 3; i++) {
            System.out.println(names[i]);
        }
/*
        System.out.println("Размер массива ages[] = " + ages.length);
        System.out.println("Размер массива surname[]= " + surname.length);
        System.out.println("Размер массива prices[] = " + prices.length);   */
    }
}
