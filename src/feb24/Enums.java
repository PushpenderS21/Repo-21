package feb24;

public class Enums {
    enum day {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FIRDAY(5), STAURDAY(6), SUNDAY(7);
        private int i;

        day(int i) {
            this.i = i;
        }
    }

    public static void main(String[] args) {
        for (day d : day.values()) {
            System.out.println(d + " : " + d.i);
        }
    }

}
