package feb15;

class MiddleCharacter {
    public void middleChar(String string) {
        int length = string.length();
        if (length % 2 == 0) {
            System.out.println("The middle characters are: " + string.charAt((length / 2) - 1) + " and " + string.charAt(length / 2));

        } else {
            System.out.println("The middle character is : " + string.charAt(((length + 1) / 2) - 1));

        }


    }

}

public class MethodPractice1 {
    public static void main(String[] args) {
        MiddleCharacter middleCharacter = new MiddleCharacter();
        middleCharacter.middleChar(("karan"));


    }
}
