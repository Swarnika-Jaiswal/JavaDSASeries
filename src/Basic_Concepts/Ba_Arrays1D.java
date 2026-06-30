package Basic_Concepts;

import java.util.Scanner;
public class Ba_Arrays1D {
    public static void main(String[]args) {
//        array declaration
        int arr[];
//       memory allocation
        arr = new int[5];
//        initialization
        int brr[] = {4,2,6};

//       array accessing : array_name[index]
        System.out.println("Value at 0 index:" + brr[0]);
        System.out.println("Value at 1 index:" + brr[1]);
        System.out.println("Value at 2 index:" + brr[2]);
//      array accessing using for loop:
        int n = brr.length;
        for(int index=0; index<=n-1; index++){
            System.out.println(brr[index]);
        }
//       accessing array using for each loop:
        for(int val : brr){
            System.out.println(val);
        }

//        array input:
        int crr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n1 = crr.length;
        for(int i=0; i<n1; i++){
            System.out.println("Enter input at"+crr[i]+"index:");
            crr[i] = sc.nextInt();
        }
        System.out.println("Your array contains:");
        for(int val: crr){
            System.out.println(val);
        }
//      total sum of array:
        int sum = 0;
        for(int i = 0; i<n1; i++){
            sum = sum + crr[i];
        }
        System.out.println("Total sum = " + sum);
//      total product of an array:
        int pro=1;
        for(int i = 0; i<n1; i++){
           pro= pro * crr[i];
        }
        System.out.println("Total product = "+pro);

//      To find maximum value in an array:
         int drr[] ={8,2,28,11,6};
         int n2 = drr.length;
         int max = drr[0];
         for(int i=0; i<n2; i++){
             if(drr[i]>max){
//                 updated max
                 max = drr[i];
             }
         }
        System.out.println("Maximum value in an array:"+ max);



//      To find minimum value in an array:
        int err[]= {10,-5,0,8,-1};
        int n3 = err.length;
        int min = err[0];
        for(int i = 0; i<n; i++) {
            if (err[i] < min) {
//                update min
                min = err[i];
            }
        }
        System.out.println("The minimum value in an array is:"+ min);


}
}