package Abstraction;

abstract class Bird{

    abstract void fly();

    abstract void eat();


}

class Sparrow extends Bird {

    void fly(){
        System.out.println("Sparrow flyuing");
    }

    void eat(){
        System.out.println("Sparrow eating");
    }

}

class Crow extends Bird {

    void fly(){
        System.out.println("Crow flyuing");
    }

    void eat(){
        System.out.println("Crow eating");
    }

}

public class Main {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.eat();
        b.fly();

        Bird c = new Crow();
        c.fly();
        c.eat();
    }

}
