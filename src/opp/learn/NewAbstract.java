package opp.learn;

public class NewAbstract {
    public static void main(String[] args) {
       // System.out.println("NewAbstract");
        Hp obj = new Hp();
        Asus obj1 = new Asus();

       ShowConf(obj);
    }
    public static void ShowConf(Laptop laptop){
        laptop.showconfig();
    }
}

abstract class Laptop{
    public abstract void showconfig();
}

class Hp extends Laptop{
    public void showconfig(){
        System.out.println("HP 8GB RAM");
    }
}

class Asus extends Laptop{
    public void showconfig(){
        System.out.println("Asus 6GB Ram");
    }
}
