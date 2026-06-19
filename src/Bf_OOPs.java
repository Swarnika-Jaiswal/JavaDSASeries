//OOP(Object Oriented Programming):
/*
1.It is used to solve real world problems.
2.It divides the problems into pieces of objects that can communicate with each other.
3.Each object has its own attributes(properties) and behaviour.
4.Fundamental idea is to combine into single unit (attribute+behaviour).
5.OOP promotes modularity
6.OOP is a life.
 */
// CLASS: Blueprint of object.
// OBJECT: instance of the class.


import java.rmi.StubNotFoundException;

public class Bf_OOPs {
   public static void main(String[] args) throws Exception {
//        System.out.println("Hello World!");
//       Default ctor
       Bg_Student_OOP A = new Bg_Student_OOP();
       A.id = 1;
       A.age = 15;
       A.name = "Rahul";
       A.nos = 4;
       System.out.println(A.id);
       System.out.println(A.age);
       System.out.println(A.name);
       System.out.println(A.nos);

       A.bunk();
       A.study();
       A.sleep();


    }


}
