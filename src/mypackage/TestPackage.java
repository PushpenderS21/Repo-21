package mypackage;

class Computer {

    public void calculate() {
        System.out.println("calculate");
    }

    public void surfIn() {
        System.out.println("Hello");
    }
}

interface Music {
    void playMusic();
}

public class TestPackage {
    public static void main(String[] args) {
        Computer computer = new Computer() {
            @Override
            public void calculate() {
                System.out.println("calculating");

            }
        };
        computer.calculate();

    }
}



