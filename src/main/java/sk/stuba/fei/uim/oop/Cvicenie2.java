package sk.stuba.fei.uim.oop;

import java.util.Objects;

public class Cvicenie2 {
    public static void main(String[] args) {
        String a = "a";
        String b = null;
        String c = KeyboardInput.readString("zadajte text");
        System.out.println("a == a" + (a == a));
        System.out.println("a == b" + (a == b));
        System.out.println("a == c" + (a == c));
        System.out.println("Objects.equals(a, c)" + Objects.equals(a, c));
        System.out.println("Objects.equals(b, c)" + Objects.equals(b, c));
        System.out.println("a.equals(c)" + a.equals(c));
    }
}
