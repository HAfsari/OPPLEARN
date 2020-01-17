package base14012020;

public class Drived extends Base {
    public String name = "Hejbullah";


    public Drived() {
        System.out.println("Drived");
        System.out.println(super.name);
    }

    public void drived(){
        System.out.println("Drived Method");
        System.out.println(super.name);
    }
}
