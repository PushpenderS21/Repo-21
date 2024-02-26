package feb20;

public class OddNumException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid input ,please enter a even number";
    }
}

class number {
    public static void getNumber(int x) throws OddNumException {
        if (x % 2 != 0) {
            throw new OddNumException();
        } else {
            System.out.println("thank you");
        }
    }
}
