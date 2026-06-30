package Basic_Concepts;

import java.util.Scanner;

public class Bb_Arrays2D {
    public static void main(String[] args) {
//        declaration
        int [][] arr;
//        memory allocation: array_name[row][column]
        arr = new int[2][3];
//        initialization
       int[][] brr = {
               {1,2},
               {2,3},
               {3,4}
       };
//     To print:
       System.out.println(brr[2][1]);
//     To print all same number of rows and column of 2D arrays:
        int rowlength = brr.length;
        int columnlength = brr[0].length;
        for(int i=0; i<rowlength; i++){
            for(int j=0; j<columnlength; j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();

        }
//     To print arrays of different rows and column:
        int crr[][] = {
                {1,5},
                {4,8,1,6},
                {2,7,1}
        };
        int rowlen = crr.length;
        for(int i=0; i<rowlen; i++) {
//            jb bhi variable rows and column hote h tb hm row ka length array ki length se hi find krte h as previous but column length hm hrr row ke liye find krte h.
//            jacked array
            int columnlen = crr[i].length;
            for (int j = 0; j < columnlen; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }

//      Input in 2D array:
            int drr[][] = new int[2][3];
            int n = drr.length;
            Scanner sc = new Scanner(System.in);
            for(int i=0; i<n; i++) {
                int n1 = drr[i].length;
                for (int j = 0; j < n1; j++) {
                    drr[i][j] = sc.nextInt();
                }
            }
//                  print:
                  for (int i =0; i<n; i++){
                      int n1=drr[i].length;
                      for(int j=0; j<n1; j++){
                          System.out.print(drr[i][j] + " ");
                      }
                      System.out.println();
                  }

//      To sum all the values of an 2D array:
            int err[][] = {{1,2,3},{4,5,6}};
                  int sum = 0;
                  for (int i=0; i<err.length; i++){
                      for (int j = 0; j<err[i].length; j++){
                          sum = sum + err[i][j];
                      }
                  }
                  System.out.println("Total sum of 2D array:"+sum);


//      To product all the values of an 2D array:
                 int frr[][] = {{1,2,3},{4,5,6}};
                 int pro = 1;
             for (int i=0; i<frr.length; i++){
            for (int j = 0; j<frr[i].length; j++){
                pro = pro + err[i][j];
            }
        }
        System.out.println(" Product of 2D array:"+pro);


//       To find the maximum value in 2D array:
        int grr[][] = {{1,5,9},{3,5,7}};
        int max = grr[0][0];
        for (int i = 0; i<grr.length;i++){
            for (int j=0; j<grr[i].length; j++){
                if(grr[i][j] > max){
                    max = grr[i][j];
                }
            }
        }
        System.out.println("Max value="+ max);

//    To find minimum value in 2D array:
        int hrr[][] = {{1,5,9},{3,5,7}};
        int minval = hrr[0][0];
        for (int i = 0; i<hrr.length; i++){
            for (int j=0; j<hrr[i].length; j++){
                if(hrr[i][j] < minval){
                    minval = hrr[i][j];
                }
            }
        }
        System.out.println("Min value="+ minval);





    }
}
