package Polymophism17012020;

class A{
    public void add(){
        System.out.println("Add1");
    }
}

class B extends A{
    public void add(String name){
        //System.out.println(super.add());
        System.out.println("Add2 "+ name);
    }
}

public class DynamicPloy {
    public static void main(String[] args) {
      A ob1 = new B();
      ob1.add();
    //  ob1.add("Afsari");



    }
}
