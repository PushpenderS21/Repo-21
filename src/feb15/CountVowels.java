package feb15;

class CountVowel {
    public void vowels(String word) {
        int count = 0;
        char[] newWord = word.toCharArray();
        for (int i = 0; i < newWord.length; i++) {
            if (newWord[i] == 'a' || newWord[i] == 'e' || newWord[i] == 'i' || newWord[i] == 'o' || newWord[i] == 'u') {
                count++;
            }

        }
        System.out.println(count);

    }
}

public class CountVowels {
    public static void main(String[] args) {
        CountVowel countVowel = new CountVowel();
        countVowel.vowels("abhishek");

    }
}
