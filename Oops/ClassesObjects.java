package Oops;

public class ClassesObjects {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void  setColor(String newcolor) {
        color = newcolor;
    }

    void  setTip(int newtip) {
        tip = newtip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercerntage(int phy, int chem, int math) {
        percentage = (phy + chem + math);
    }

}

