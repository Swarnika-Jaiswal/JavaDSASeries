// CONDITIONALS IN JAVA:
/*
>if statement
>if-else statement
>if-else-if ladder
>Nested if-else
>Ternary operator
>Switch statement
*/


public class Ag_Conditionals {
    public static void main(String[] args) {

        // IF STATEMENT:
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote!");
        }


        // IF-ELSE STATEMENT:
        int a = 5;
        int b = 7;
        if (a > b) {
            System.out.println("A is greater");
        } else
            System.out.println("B is greater");


        // IF-ELSE-IF LADDER:
        int day = 4;

        if (day == 1) {
            System.out.println("Monday");
        }
        else if (day == 2) {
            System.out.println("Tuesday");
        }
        else if (day == 3) {
            System.out.println("Wednesday");
        }
        else if (day == 4) {
            System.out.println("Thursday");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }
        else if (day == 7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid day number");
        }


        // NESTED IF-ELSE STATEMENT:
        int x = 2;
        int y = 8;
        int z = 5;
        if (x > y) {
            if (x > z) {
                System.out.println("X is greatest.");
            }
            else
                System.out.println("Z is greatest.");
        }
        else System.out.println("Y is greatest.");


        // TERNARY OPERATORY:
        int streakDays = 35;
        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
        System.out.println(status);


        // SWITCH STATEMENT:
        int level = 2;
        switch (level) {
            case 1:
                System.out.println("Beginner");
                break;
            case 2:
                System.out.println("Intermediate");
                break;
            case 3:
                System.out.println("Advanced");
                break;
            default:
                System.out.println("Not started yet!");
        }





    }
}