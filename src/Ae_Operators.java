/* OPERATORS:
>Operators are special symbols used to perform operations on variables and values.
TYPES:
>Arithmetic Operators
>Assignment Operators
>Relational Operators
>Logical Operators
>Unary Operators
>Bitwise Operators
>Other Operators (instanceof, ternary)
 */


import java.sql.SQLOutput;

public class Ae_Operators {
    public static void main(String[] args){

//  AIRTHMETIC OPERATORS:
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);


//  ASSIGNMENT OPERATORS:
        int ratingPoints = 100;
        ratingPoints += 20;
        System.out.println(ratingPoints);
        ratingPoints -= 10;
        System.out.println(ratingPoints);
        ratingPoints *= 2;
        System.out.println(ratingPoints);
        ratingPoints /= 4;
        System.out.println(ratingPoints);
        ratingPoints %= 30;
        System.out.println(ratingPoints);


//  RELATIONAL OPERATORS:
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);


//  LOGICAL OPERATORS:
        boolean completedDSA = true;
        boolean completedCore = false;
        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);


//  UNARY OPERATOR:
        int activeUsers = 100;
        int prefix = ++activeUsers;
        int postfix = activeUsers++;
        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);


//  BITWISE OPERATOR:
        int x = 6;  // 00000110
        int y = 3;  // 00000011
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);
        System.out.println(x << 1);
        System.out.println(x >> 1);


//  TERNARY OPERATOR:  (Shorthand for if-else)
        int solvedProblems = 320;
        String level = (solvedProblems >= 300) ? "Advanced" : "Intermediate";
        System.out.println(level);

//  instanceof OPERATOR:  (Check whether an object belongs to a particular class or not.)
//        true → if object belongs to that class
//        false → otherwise
        String name = "Swarnika";
        System.out.println(name instanceof String);


//  OPERATOR PRECEDENCE:
//  Operators are evaluated in order.
        int result = 10 + 5 * 2;
        System.out.println(result);






    }
}
