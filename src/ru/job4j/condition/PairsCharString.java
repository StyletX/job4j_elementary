package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.equals("") && (r.equals(""))) {
            return true;
        }
        char a = l.charAt(0);
        char b = l.charAt(l.length() - 1);
        char c = r.charAt(0);
        char d = r.charAt(r.length() - 1);
        return ((a == d) && (b == c));
    }
}