package feb12;

public class CommonElements {
    public static void main(String[] args) {
        String[] arr1 = {"name", "game", "love", "hate"};
        String[] arr2 = {"fate", "destiny", "hate", "World"};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                }

            }

        }
    }
}
