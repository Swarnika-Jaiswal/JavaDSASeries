package Abstraction;

abstract class Bird{

    abstract void fly();

    abstract void eat();


}

class Sparrow extends Bird {
    @Override
    void fly(){
        System.out.println("Sparrow flying");
    }
    @Override
    void eat(){
        System.out.println("Sparrow eating");
    }

}

class Crow extends Bird {
   @Override
    void fly(){
        System.out.println("Crow flying");
    }
   @Override
    void eat(){
        System.out.println("Crow eating");
    }

}

public class Main {


    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
    }


    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.eat();
        b.fly();


//    Another way without making an object(just like Upcasting)
        doBirdStuff(new Crow());
    }

}
