package AAc_Polymorphism;



public class Main {


    public static void main(String[] args) {
//      Compiletime Polymorphism:
        /*
        Calculator c = new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));
        System.out.println(c.add(2,3,3.2));

        */


//      Runtime Polymorphism:
//      1. Method Overriding
        /*
        Circle c = new Circle();
        c.draw();

        Rectangle r = new Rectangle();
        r.draw();

        */

//      2. Upcasting
        Circle c = new Circle();
        doDrawing(c);

        Rectangle r = new Rectangle();
        doDrawing(r);





    }


    public static void doDrawing(Shape s){
        s.draw();
    }
}
