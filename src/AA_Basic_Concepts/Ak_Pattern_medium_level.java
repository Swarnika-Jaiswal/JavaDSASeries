package AA_Basic_Concepts;

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




//      ROMHBUS:
        System.out.println("ROMHBUS");
        int n=5;
        for(int i=1; i<=n; i++){
            for(int space=1; space<=(n-i); space++){
                System.out.print(" ");
            }
            for(int star=1; star<=n; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();



//  HALLOW RIGHT ANGLED TRAINGLE:
        System.out.println("HALLOW RIGHT ANGLED TRAINGLE:");
        int n2=5;
        for(int row =1; row<=n2; row++){
//          column
            for(int col=1; col<=row; col++){
//                stars
                if(col==1 || col==row || row==n2){
                    System.out.print("*");
                }
//                spaces
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




//  HALLOW PYRAMID:
        System.out.println("HALLOW PYRAMID:");
        int n3=5;
        for(int row=1; row<=n3; row++){

//                part1
                for(int col=1; col<=n3-row; col++){
                    System.out.print(" ");
                }
//                part2
                if(row==1 || row==5){
                    for(int col=1; col<=2*row-1; col++){
                        System.out.print("*");
                    }

                }
                else{
//                    1*
                    System.out.print("*");
//                    2r-3 spaces
                    for(int col=1; col<=2*row-3; col++){
                        System.out.print(" ");
                    }
//                    1*
                    System.out.print("*");
                }
            System.out.println();

        }
        System.out.println();
        System.out.println();




//  HALLOW RECTANGLE:
        System.out.println("HALLOW RECTANGLE:");
        int n4=5;
        for(int row=1; row<=n4; row++){
            for(int col=1; col<=n4; col++){
               if(row==1 || row==5){
                   System.out.print("*");
               }
               else{
                   if(col==1 || col==n4){
                       System.out.print("*");
                   }
                   else{
                       System.out.print(" ");
                   }
               }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();




//  NUMBER PYRAMID 1:
        System.out.println("NUMBER PYRAMID:");
        int n5=5;
        for(int row=1; row<=n5; row++) {
//            spaces
            for (int col = 1; col <= n5 - row; col++) {
                System.out.print(" ");
            }
//            numbers
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(col);

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();



//  NUMBER PYRAMID 2:
        int n8=4;
        for(int row=1; row<=n8; row++){
//         part 1
            for(int col=1; col<=n8-row; col++){
                System.out.print("  ");
            }
//        part 2
            for(int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
//         part 3
            int decvalue= row-1;
            for(int col=1; col<=row-1; col++ ){
                System.out.print(decvalue + " ");
                decvalue--;
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();



//  NUMBER PYRAMID 3:
        int n9 = 4;
        for(int row=1; row<=n9; row++){
            for(int col=1; col<=n9-row; col++){
                System.out.print("  ");
            }
            for(int col=1; col<=2*row-1; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();



//  CHARACTER PYRAMID 1:
        System.out.println("CHARACTER PYRAMID 1:");
        int n6=5;
        char alpha='A';
        for(int row=1; row<=n6; row++){
//            spaces
            for(int col=1; col<=n6-row; col++){
                System.out.print(" ");
            }
//            characters
            for (int col=1; col<=2 * row - 1; col++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();



//  CHARACTER PYRAMID 2:
        System.out.println("CHARACTER PYRAMID 2:");
        int n7=5;
        for(int row=1; row<=n7; row++){
//            spaces
            for(int col=1; col<=n7-row; col++){
                System.out.print(" ");
            }
//            characters
            for (int col=1; col<=2 * row - 1; col++){
                System.out.print((char)(64 + col));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();



//  CHARACTER PYRAMID 3:
        System.out.println("CHARACTER PYRAMID 3:");
        int n10= 4;
        for(int row=1; row<=n10; row++){
//            part 1
            for(int col=1; col<=n10-row; col++ ){
                System.out.print("  ");
            }
//            part 2
            for(int col=1; col<=row; col++){
                System.out.print((char)('A'+col-1)+" ");
            }

//            part 3
            for(int col=row-1; col>=1; col--){
                System.out.print((char)('A'+ col-1)+" ");
            }
            System.out.println();

        }























    }
}
