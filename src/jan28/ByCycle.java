package jan28;

interface Cycle {
    void speedUp(int increment);

    void applyBrake(int decrement);

}

interface Cycle2 {
    void blowHorn();

    void lightOnn();

}

class HeroCycle implements Cycle, Cycle2 {
    int speed = 7;

    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println(speed);

    }

    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println(speed);


    }

    @Override
    public void blowHorn() {
        System.out.println("pee pee");
    }

    @Override
    public void lightOnn() {
        System.out.println("Lights on  indicates break applied");
    }
}

public class ByCycle {
    public static void main(String[] args) {
        HeroCycle cycle = new HeroCycle();
        //  cycle.speedUp(7);
        cycle.applyBrake(7);
        cycle.blowHorn();
    }
}

