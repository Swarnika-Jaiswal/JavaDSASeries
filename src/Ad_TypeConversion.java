/*
IMPLICIT TYPE CASTING:
>Converts smaller data type → larger data type
>No data loss
>done automatically by java.

EXPLICIT TYPE CASTING:
>Converts larger data type → smaller data type
>May cause data loss.
>Done manually by programmer.
*/



public class Ad_TypeConversion {
    public static void main (String[] args){
        int num = 25;
        double value = num;   // implicit casting
        System.out.println(value);

        double price = 99.99;
        int cost = (int) price;   // explicit casting
        System.out.println(cost);
    }
}
