package jan30;

abstract class Pen {
    public abstract void refil();

    abstract public void write();
}

class foutainPen extends Pen {
    public void refil() {
        System.out.println("putting ink in the pen");
    }

    public void write() {
        System.out.println("writing.....");

    }

    public void changeNib() {
        System.out.println("Please change the nib");
    }
}

public class MyPen {
    public static void main(String[] args) {
        foutainPen pen = new foutainPen();
        pen.refil();
        pen.write();
        pen.changeNib();
    }
}
