public class Al_Pattern_hard {
    public static void main(String[] args) {

//  DIAMOND PATTERN:
        System.out.println("DIAMOND PATTERN:");
        int n1=5;
        for(int row=1; row<=n1; row++){
            for(int col=1; col<=n1-row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        int val = 4;
        for(int row=1; row<=val; row++){
            for(int col=1; col<=row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*val-2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();

        }


//        HALLOW DIAMOND:
        System.out.println("HALLOW DIAMOND:");
//        part 1
        int n2=5;
        for(int row=1; row<=n2; row++){
            for(int col=1; col<=n2-row; col++){
            System.out.print(" ");
            }
            if(row==1){
                System.out.print("*");
            }
            else{
//                1*
                System.out.print("*");
//                2r-3 spaces
                for(int col=1; col<=2*row-3; col++){
                    System.out.print(" ");
                }
//                1*
                System.out.print("*");
            }
            System.out.println();
        }
//        part 2
        int val2=4;
        for (int row = 1; row <= val2; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            if(row==val2){
            System.out.print("*");}
            else{
//                1*
                System.out.print("*");
//                spaces

                    for (int col = 1; col<=2*(val2-row)-1; col++) {
                        System.out.print(" ");
                    }
//                  1*
                    System.out.print("*");

            }

            System.out.println();
        }
        System.out.println();



//  BUTTERFLY PATTERN:
        System.out.println("BUTTERFLY PATTERN;");
//        upper half
        int n3=4;
        for(int row=1; row<=n3; row++){

            for(int col=1; col<=row; col++){
                System.out.print("*");}

                for(int col=1; col<=2*n3-2*row; col++){
                    System.out.print(" ");
                }
                for(int col=1; col<=row; col++){
                    System.out.print("*");
                }

            System.out.println();
        }
//        lower half
        for(int row=3; row>=1; row--){
            for(int col=1; col<=row; col++) {
                System.out.print("*");
            }

            for(int col=1; col<=2*n3- 2*row; col++){
                System.out.print(" ");
            }

            for(int col=1; col<=row; col++){
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();



//  SANDGLASS PATTERN:
        System.out.println("SANDGLASS PATTERN:");
        int n4=5;
        for(int row=1; row<=n4; row++){
//      upper half
//            spaces
            for(int col=1; col<=row-1; col++){
                System.out.print(" ");
            }
//            stars
            for(int col=1; col<=2*n4-2*row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=3; row>=0; row--){
            for(int col=1; col<=row; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*n4-(2*row+1); col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


//     X   PATTERN:
        System.out.println("X PATTERN:");
        int n5=5;
//        upper half
        for(int row=1; row<=n5; row++){
            for(int col=1; col<=row-1; col++){
                System.out.print(" ");
            }
            System.out.print("*");
            int spaces=2 * (n5 - row) - 1;
            if(spaces>0) {
                for (int col = 1; col <=spaces; col++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

//           Lower Half
        for(int row=n5-1; row>=1; row--){
            for(int col=1; col<=row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int spaces=2*(n5-row)-1;
            if(spaces>0) {
                for (int col = 1; col <= spaces; col++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

































    }
}
