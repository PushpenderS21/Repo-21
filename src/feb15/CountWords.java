package feb15;

class CountWord {
    public void word(String word) {
        String[] result = word.split("\\s");
        System.out.println(result.length);

    }
}

public class CountWords {
    public static void main(String[] args) {
        CountWord countWord = new CountWord();
        countWord.word("I am an amazing person");
    }
}
