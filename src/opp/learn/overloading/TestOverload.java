package opp.learn.overloading;

public class TestOverload {
    public static void main(String[] args) {

        overload obj = new overload();

        obj.add();
        obj.add(2,3);


       double num = obj.add(4.5,5.5,4.5);
       //obj.add(2.2,2.3,2.4);
        System.out.println(num);
    }
}
