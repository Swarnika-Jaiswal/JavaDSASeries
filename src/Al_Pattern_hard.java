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
































    }
}
