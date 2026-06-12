public class Ak_Pattern_medium_level {
    public static void main(String[] args) {

//  HALF PYRAMID:
        System.out.println("HALF PYRAMID:");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//  PYRAMID:
        System.out.println("PYRAMID:");
        int n1 = 5;
        for(int i=1; i<=n1; i++){
            //  spaces
            for(int space=1; space<=(n1-i); space++){
                System.out.print(" ");
            }
            //   stars
            for(int star=1; star<=2*i-1; star++ ){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println();



//  INVERTED PYRAMID:
        System.out.println("INVERTED PYRAMID:");
        int num=5;
        for(int i=1; i<=num; i++){
//            spaces
            for(int spaces=1; spaces<=i-1; spaces++){
                System.out.print(" ");
            }
//            stars
            for(int star=1; star<=2*num-2*i+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();









    }
}
