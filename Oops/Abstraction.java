package Oops;

public class Abstraction {
    public static void main(String[] args) {
        /**Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang**/
        Queen q = new Queen();
        q.moves();
    }
}
abstract class Animal1 {
    String color;

    Animal1() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}
class Horse extends Animal1 {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk () {
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("constructor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walk on 2 legs");
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 dirns)");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}
