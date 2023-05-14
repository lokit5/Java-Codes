package Oops;

public class GettersSetters {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen1 {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String newColor) {
        this.color = newColor;
    }
    void setTip(int newtip) {
        this.tip = newtip;
    }
}

