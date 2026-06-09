//JAVA VARIABLES
/*
Defination: A variable is a named memory location used to store data.

Syntax: datatype variable_name = literals(value);
        int problemsSolved = 120;

Naming Rules for Variables:
           >Can contain letters, digits, _, $
           >Cannot start with a digit
           >Cannot use Java keywords
           >Case-sensitive
RULES:
>Java is Statically Typed = Java requires that every variable be declared before it is used.
>The value stored inside a variable can change.
      int rank = 450;
      rank = 320;
>Type Cannot Change
      int streak = 30;
      double streak = 30.5; ❌ Not allowed
*/

//JAVA LITERALS
/* Types:
>Integer Literals

>Floating-Point Literals
    double averageScore = 78.6;
    float discountPercent = 15.5F;
>Scientific Notation
    double serverLoad = 2.5e3; where e=10^3
>Character Literals
    char grade = 'A';
    char newLine = '\n';
    char tabSpace = '\t';
>String Literals
    String platformName = "CodeHelp ONE";
    String courseTrack = "DSA + Core + Aptitude";
>Boolean Literals
    boolean isLoggedIn = true;
    boolean hasCompletedSheet = false;
*/



public class Variables {
    public static void main(String[] args){
        int age = 20;
//        int 1age = 20; INVALID
        int _count = 5;
        int $price = 100;
        String studentName ="Swarnika";
//        String student name; int class = 5; INVALID
        double accountBalance = 10.1;
        int marks = 95;
        int Marks = 80;
        int student1 = 123;
//        int 1student; INVALID
        final double PI = 3.14;
//        final double pi = 3.14; (not preferred for constants)

        System.out.println(age);
        System.out.println(_count);
        System.out.println($price);
        System.out.println(studentName);
        System.out.println(accountBalance);
        System.out.println(marks);
        System.out.println(Marks);
        System.out.println(student1);
        System.out.println(PI );



    }
}
