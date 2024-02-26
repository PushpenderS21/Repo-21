package feb17;

import mypackage.Summation;
import mypackage.submypackage.Greeting;

public class Test2 {
    public static void main(String[] args) {
        Summation summation = new Summation();
        summation.test();
        Greeting greetings = new Greeting();
        greetings.greetings();
    }
}
