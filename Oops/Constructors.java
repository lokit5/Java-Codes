package Oops;

import java.util.Arrays;

public class Constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Lokit";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student1 s2 = new Student1(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        System.out.println(Arrays.toString(s2.marks));

    }
}

class Student1 {
     String name;
     int roll;
     String password;
     int marks[];
     //copy constructor(Shallow copy)
     //Student1(Student1 s1) {
     //    marks = new int[3];
     //    this.name = s1.name;
     //    this.roll = s1.roll;
     //    this.marks = s1.marks;
     //}
    //softcopy
     Student1(Student1 s1) {
         marks = new int[3];
         this.name = s1.name;
         this.roll = s1.roll;
         for(int i = 0; i<marks.length; i++) {
             this.marks[i] = s1.marks[i];
         }
     }
     Student1() {
         marks = new int[3];
         System.out.println("constructor is called...");
     }
     Student1(String name){
         marks = new int[3];
         this.name = name;
     }
     Student1(int roll) {
         marks = new int[3];
         this.roll = roll;
     }
}

