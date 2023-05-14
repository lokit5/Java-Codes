package Oops;

public class SuperKeywoord {
    public static void main(String[] args) {
        Horse2 h = new Horse2();
        System.out.println(h.color);
    }
}
    class Animal2 {
        String color;
        Animal2() {
            System.out.println("Animal constructor is called");
        }
    }

    class Horse2 extends Animal2 {
        Horse2() {
            super.color = "brown";
            System.out.println("horse constructor is called");
        }
    }

