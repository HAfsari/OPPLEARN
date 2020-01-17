package Polymophism17012020;

import java.util.PrimitiveIterator;

public class Relationship {
    public static void main(String[] args) {
        Student st = new Student();
        st.tname = "Afsari";
        st.subject = "ICT";
        st.setId(1);
        st.getId();
        st.setName("Rohit");
        st.getName();

    }
}

class Teacher {
    public String tname;
    public String subject;
}

class Student extends Teacher {
    private int id;
    private String name;
    private int roll;


    public Student(int id, String name, int roll) {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}