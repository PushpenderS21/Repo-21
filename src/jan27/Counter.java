package jan27;

public class Counter {
    int counter;

    public void incrementCounter() {
        counter++;
        System.out.println(counter);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();
        Counter counter6 = new Counter();
        counter.incrementCounter();
        counter2.incrementCounter();
        counter3.incrementCounter();
        counter4.incrementCounter();
        counter5.incrementCounter();
        counter6.incrementCounter();
    }
}
