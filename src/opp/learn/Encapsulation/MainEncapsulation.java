package opp.learn.Encapsulation;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class MainEncapsulation {
    public static void main(String[] args) {
      Student st = new Student();
      st.setRollNo(10);
        System.out.println(st.getRollNo());

    }
}

class Student{
    private int RollNo;
    private String Name;
    private String SClass;
    private String Gender;

    public Student(){

    }

    public int getRollNo(){
        return RollNo;
    }
    public void setRollNo(int rollNo){
        this.RollNo = rollNo;
    }
}