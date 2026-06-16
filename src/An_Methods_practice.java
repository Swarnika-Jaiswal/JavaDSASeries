public class An_Methods_practice {
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


//    6. Create an overloaded method DISPLAY() with one int parameter or one string parameter.


//    7. Create a method UPDATEVALUE(int x) and verify that original variable in main() does not change.



    public static void main(String[] args) {
        PRINTWELCOMEMESSAGE();
        ADD(2, 4);
        System.out.println(ISEVEN(4)); // true
        System.out.println(ISEVEN(7)); // false
        System.out.println("Percentage="+ CALCULATEPERCENTAGE(524,600));

    }
}