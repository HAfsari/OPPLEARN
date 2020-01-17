package Polymophism17012020;


class Animal {
    public String type;
}

class Dog extends Animal {
    private String color;
    private double age;

    public Dog() {
    }

    public Dog(String color, double age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}

class Cow extends Animal {
    private String color;
    private double age;
    private String genric;

    public Cow() {
    }

    public Cow(String color, double age, String genric) {
        this.color = color;
        this.age = age;
        this.genric = genric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGenric() {
        return genric;
    }

    public void setGenric(String genric) {
        this.genric = genric;
    }
}

public class Relationship_Animal {
    public static void main(String args[]) {
        Animal a = new Animal();
        Dog m = new Dog();
      //  Relationship_Animal d = new Relationship_Animal();

        System.out.println(m instanceof Animal);
        a.type = "Cow";
        m.setAge(10);
        m.setColor("Blak");
        System.out.println(m.getAge());
        System.out.println(m.getColor());

        // System.out.println(d instanceof Mammal);
       // System.out.println(d instanceof Animal);
    }
}