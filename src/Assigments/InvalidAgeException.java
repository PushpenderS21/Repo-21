package Assigments;

public class InvalidAgeException extends Exception {
    @Override
    public String getMessage() {
        return "Age must be 18 or above to vote , Please allow the next candidate";
    }
}

class Voter {
    public static void setAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException();

        } else {
            System.out.println("Welcome to voter's list");
        }

    }
}



