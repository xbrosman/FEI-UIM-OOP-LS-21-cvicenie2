package sk.stuba.fei.uim.oop;

import java.util.Arrays;

public class Cvicenie2 {
    public static void main(String... args) {
        vypis("text", 5, 3, 69, 7, 2, 69, 9, 14, 6);
    }

    public static void vypis( String text, int... pole) {
        System.out.println(text);
        System.out.println(Arrays.toString(pole));
    }
}
