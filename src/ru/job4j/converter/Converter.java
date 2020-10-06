package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl2 = value / 60;
        return rsl2;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(210);
        System.out.println("210 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(300);
        System.out.println("300 rubles are " + dollar + " dollar.");
    }
}