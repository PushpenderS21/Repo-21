package feb20;

public class DuplicateNumberException extends Exception {
    @Override
    public String getMessage() {
        return "Duplicate number found";
    }
}

class Duplicate {

    public static void duplicateNum(int[] arr) throws DuplicateNumberException {
        boolean dupNum = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dupNum = true;

                    break;
                }
            }

        }
        if (dupNum) {
            throw new DuplicateNumberException();

        } else {
            System.out.println("duplicate num not found");
        }
    }
}
