package feb9;

public class BankInterest {
    public static void main(String[] args) {
        RbcBank bank1 = new RbcBank();
        ScotiaBank bank2 = new ScotiaBank();
        BmoBank bank3 = new BmoBank();
        System.out.println(bank1.getInterestRate());
        System.out.println(bank2.getInterestRate());
        System.out.println(bank3.getInterestRate());
    }
}
