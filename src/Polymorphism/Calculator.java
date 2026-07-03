package Polymorphism;

public class Calculator {

//    Compile time Polymorphism:
//    Method Overloading
    int add (int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(int a, int b , double c){
        return a+b+c;
    }

}
