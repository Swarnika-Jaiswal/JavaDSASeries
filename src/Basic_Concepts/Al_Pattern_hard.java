package Basic_Concepts;

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
        System.out.println();


//  PASCAL'S PATTERN:
        System.out.println("PASCAL'S PATTERN:");
        int n6=5;
        for(int row=0; row<n6; row++){
            for(int col=0; col<n6-row-1;col++){
            System.out.print(" ");}
            int num=1;
            for(int col=0; col<=row; col++){
                System.out.print(num + " ");
                num=num*(row-col)/(col+1);
            }
            System.out.println();
        }
        System.out.println();

//  CONCENTRIC NUMBER PATTERN:
        System.out.println("CONCENTRIC NUMBER PATTERN:");
        int n7=4;
        int size = 2*n6-1;
        for(int row=1; row<=size; row++){
            for(int col=1; col<=size; col++){
                int top=row;
                int left= col;
                int bottom=size-1-row;
                int right=size-1-col;
                int min= Math.min(
                        Math.min(top, bottom),Math.min(top, bottom));
                System.out.print((n6-min) + " ");

            }
            System.out.println();
        }


//  SPIRAL MATRIX PATTERN:
        System.out.println("SPIRAL MATRIX PATTERN:");
        int n = 4;
        int[][] arr = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;

        while (num <= n * n) {

            // Left to Right
            for (int i = left; i <= right; i++) {
                arr[top][i] = num++;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = num++;
            }
            right--;

            // Right to Left
            for (int i = right; i >= left; i--) {
                arr[bottom][i] = num++;
            }
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top; i--) {
                arr[i][left] = num++;
            }
            left++;
        }

        // Print Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }



































    }
}
