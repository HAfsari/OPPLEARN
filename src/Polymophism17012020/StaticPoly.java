package Polymophism17012020;

public class StaticPoly {
    public void call(){
        System.out.println("Void Main");
    }
    public int call(int a){
        System.out.println("Int Call");
        return a;
    }

    public String call(String a){
        System.out.println("String Call");
        return a;
    }
    public int call(int a, int b){
        System.out.println("Int Double");
        final int i = a + b;
        return i;
    }
    public static void main(String[] args) {
        StaticPoly ob = new StaticPoly();
        ob.call();
        ob.call(1);
        ob.call(2,3);
        ob.call("String");

    }
}
