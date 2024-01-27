package jan23;

public class Date {
    int day;
    int month;
    int year;

    public Date() {
        day = 25;
        month = 01;
        year = 2024;

    }

    public Date(int day, int month) {
        //this();
        this.day = day;
        this.month = month;
    }

    public Date(int day, int month, int year) {
        this(day, month);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate() {
        System.out.println("Date :" + day + "/ " + month + "/ " + year);

    }

    public static void main(String[] args) {
        Date date = new Date();
        date.printDate();
    }

}
