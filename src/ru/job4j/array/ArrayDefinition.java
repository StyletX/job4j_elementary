package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Вася Пупкин";
        names[2] = "Иван Сидоров";
        names[3] = "Сергей Николаев";
        for (int i = 0; i <= 3; i++) {
            System.out.println(names[i]);
        }
    }
}
