package AAd_Abstraction;

abstract class Bird{

    abstract void fly();

    abstract void eat();

    public void sleep(){
        System.out.println("Bird Sleeping....");
    }


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
        b.sleep();
    }


    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.eat();
        b.fly();
        b.sleep();


//    Another way without making an object(just like Upcasting)
        doBirdStuff(new Crow());
    }

}
