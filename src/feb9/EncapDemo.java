package feb9;

class Info {
    private int age;

    /*public Info(int age) {
        this.age = age;
    }*/

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("enter a valid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class EncapDemo {
    public static void main(String[] args) {
        Info info = new Info();
        info.setAge(99);
        System.out.println("The age is: " + info.getAge());

    }
}
