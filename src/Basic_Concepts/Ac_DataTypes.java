package Basic_Concepts;

public class Ac_DataTypes {
    public static void main(String[] args){
//        NUMERIC: short, byte, int, long
        byte num1 = 100;
        System.out.println(num1);
        short num2 = 500;
        System.out.println(num2);
        int num3 = 50000;
        System.out.println(num3);
        long num4 = 32453255;
        System.out.println(num4);

//      FLOATING POINT:
        float num5 = 3.14f ;
        System.out.println(num5);
        double num6 = 3.12345678567;
        System.out.println(num6);

//        NON NUMERIC: boolean, char
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);
        char firstCharacter = 'a';
        System.out.println(firstCharacter);
        System.out.println("My First Character is:"+( firstCharacter+2));
        System.out.println("My First Character is:"+ (char)(firstCharacter+2));




    }
}
