package jan28;

interface Parent1 {
    void meth1();

    void meth2();
}

interface ChildSample extends Parent1 {
    void meth3();

    void meth4();

}

class MySample implements ChildSample {
    public void meth3() {
        System.out.println("oooo");
    }

    @Override
    public void meth4() {
        System.out.println("oooooooooooooo");

    }

    @Override
    public void meth1() {
        System.out.println("pppppppppppppp");
    }

    @Override
    public void meth2() {
        System.out.println("oooooooooooooooooooooo");
    }
}


public class InheritanceInterface {
}
