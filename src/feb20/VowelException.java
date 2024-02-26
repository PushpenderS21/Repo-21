package feb20;

public class VowelException extends Exception {
    @Override
    public String getMessage() {
        return "String does not contain vowels";
    }
}

class ContainsVowels {
    public static void Vowels(String s) throws VowelException {
        char[] a = s.toCharArray();
        boolean vowels = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                vowels = true;

            }
        }
        if (vowels) {
            System.out.println("has vowels");
        } else {
            throw new VowelException();
        }


    }
}