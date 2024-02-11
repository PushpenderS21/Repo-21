package feb9;

public class RbcBank extends Bank {

    public RbcBank() {
        super();
    }

    public double getInterestRate() {
        return interestRate + 1.2;
    }
}

