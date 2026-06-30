package Basic_Concepts;

public class An_Methods_Practice {
    //    1.Create a method PRINTWELCOMEMESSAGE() that prints a greeting.
    static void PRINTWELCOMEMESSAGE() {
        System.out.println("WELCOME!");
    }


    //    2. Create a method ADD(int a, int b) that returns the sum.
    static int ADD(int a, int b) {
        return a+b;
    }


    //    3.Create a method ISEVEN(int number) that returns true if the number is even.
    static boolean ISEVEN(int number) {
        return number % 2 == 0;
    }


    //    4.Create a method GETMAXIMUM(int a, int b) that returns the larger number.
    static int GETMAXIMUM(int a, int b) {
       return (a>b) ? a : b;
    }

    //    5.Create a method CALCULATEPERCENTAGE(int obt, int total).
         static double CALCULATEPERCENTAGE(int obt, int total){
            return(obt*100.0)/total;
        }


        //   6.Create an overloaded method DISPLAY() with one int parameter or one string parameter.
//    //     Method overloading means creating multiple methods with the same name but different parameter lists

    /// /    Method Overloading:
          static void DISPLAY(int number){
              System.out.println("Number:"+number);
          }
          static void DISPLAY(String text){
                System.out.println("Text:"+text);
            }


     //    7. Create a method UPDATEVALUE(int x) and verify that original variable in main() does not change.
          static void UPDATEVALUE(int x){
                x = x*10;
               System.out.println("UpdatedValue:"+x);
           }


    public static void main(String[] args) {
        PRINTWELCOMEMESSAGE();

        ADD(2,4);

        System.out.println(ISEVEN(4)); // true
        System.out.println(ISEVEN(7)); // false

        System.out.println("Percentage="+ CALCULATEPERCENTAGE(524,600));

        DISPLAY(100);
        DISPLAY("Hello Java!");

        int num=5;
        System.out.println("Before method call:"+ num);
        UPDATEVALUE(num);
        System.out.println("After method call:"+num);


    }
}