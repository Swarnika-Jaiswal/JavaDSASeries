package AA_Basic_Concepts;

import java.math.BigInteger;
import java.util.Scanner;

public class Af_InputOutput {
    public static void main(String[] args){

//        Integer:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of firstNum:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value of secondNum:");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is:" +ans);

//        BigInteger:
        System.out.println("Enter the value of big integer value:");
        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger:" + bg);

//        boolean:
        System.out.println("Enter the value of boolean value:");
        boolean flag = sc.nextBoolean();
        System.out.println("flag is:" + flag);

//       short:
        System.out.println("Enter the value of shoet value:");
        short shortVal = sc.nextShort();
        System.out.println("shortVal is " + shortVal);

//       float:
        System.out.println("Enter the value of float value");
        float floatVal = sc.nextFloat();
        System.out.println("floatVal is" + floatVal);

        sc.close();

    }
}
