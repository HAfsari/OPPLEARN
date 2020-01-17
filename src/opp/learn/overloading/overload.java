package opp.learn.overloading;

import java.sql.SQLOutput;

public class overload {

    void add(){
         System.out.println("Without output");
     }
     void add(int int1, int int2){
         System.out.println(int1+int2);
     }
     double add(double v, double num, double num1){
        // System.out.println("Do Method");
         return num + num1 +v;


     }

     void add(int num, double num1){
         System.out.println(num+ num1);
     }
}
