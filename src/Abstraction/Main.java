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

public class Main {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.eat();
        b.fly();
    }

}
