package feb3;

import java.util.Arrays;

public class StringsDemo {
    public static void main(String[] args) {
        String s1 = "phone ";
        String s2 = "phone is i phone and red in color";
        String a3 = "phone";
        String a4 = "phone";
        String s5 = new String("test");
        String s6 = new String("phone");
        System.out.println(s1 == s2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s2.equals(s5));
        System.out.println(s2.equals(s6));
        System.out.println(10 + s1 + 10);
        System.out.println(s1 + 10 + 10);
        System.out.println(10 + 10 + s1);
        String s7 = "rahul";
        String s8 = "rahul";
        String s9 = new String("rahul");
        System.out.println(s7 == s8);
        System.out.println(s7 == s9);
        String s = String.format("%s %s", s1, s2);
        System.out.println(s);
        String[] sam = s2.split("\\s");
        System.out.println(Arrays.toString(sam));
        String s11 = s9.intern();
        String s12 = String.format("%s %s", a3, a4);
        System.out.println(s12);

        StringBuilder samy = new StringBuilder("john");


    }

}
