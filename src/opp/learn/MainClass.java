package opp.learn;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MainClass {

    public static void main(String[] args) {
        Readmi obj2 = new Readmi() {
            @Override
            public void web1() {
                System.out.println("Web2....");
            }
        };
       // Readmi objs = new Samsung();
      //  objs.web1();

        obj2.call();
        obj2.call();
        obj2.finger();
        obj2.snap();
        obj2.web1();
    }
}

abstract class Iphone {
    public void call() {
        System.out.println("Calling.....");
    }

    public abstract void snap();
    public abstract void finger();
    public abstract void web1();
}

abstract class Readmi extends Iphone {
    public void call() {
        System.out.println("Readmi Call");
    }

    public void snap() {
        System.out.println("Snap Print");
    }

    @Override
    public void finger() {
        System.out.println("Override");
    }

}

class Samsung extends Readmi {
    public void web1() {
        System.out.println("Web.....");
    }
}

