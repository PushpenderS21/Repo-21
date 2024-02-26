package feb24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("aaa");
        Pattern p2 = Pattern.compile("aaap");
        Matcher m = p.matcher("ronNNnnnnnYYYY");
        Matcher m1 = p2.matcher("aaapaaa");
        Pattern p3 = Pattern.compile("ronnn", Pattern.CASE_INSENSITIVE);
        Matcher m2 = p3.matcher("ronNNnnnnnYYYY");
        System.out.println(Pattern.matches("\\d*", "12"));


//        System.out.println(m.pattern());
//        System.out.println(m1.pattern());
        if (m2.find()) {
            System.out.println("match found");

        } else {
            System.out.println("not found");
        }
//        if (m1.find()) {
//            System.out.println("match found");
//
//        } else {
//            System.out.println("not found");
//        }
    }

}
