package AB_Array;

public class ABa_ArraysProblem {


// 1. Find the average of array elements:
// 2. Multiply each element of array by 10:
// 3. Search for an element in an array{Linear Search}:
// 4. Find the maximum element in an array:
// 5. Return sum of +ve and -ve numbers :
// 6. Count the number of zeros and ones in an array:
// 7. Find first unsorted element in an array:


  static double getAverage(int[] arr){
      double sum = 0;
      for(int i : arr){
          sum += i;
      }
      int size = arr.length;
      double avg = sum/size;
      return avg;
  }



  static int[] multiplyBy10(int[] arr){
      int size = arr.length;
      int newArray[] = new int[size];

      for (int i=0; i<size; i++){
          int element = arr[i];
          int newElement = element * 10;
          newArray[i] = newElement;
      }
      return newArray;
  }



  static boolean findTarget(int arr[], int target) {
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              return true;
          }
      }
      return false;

  }


      static int maxElement ( int arr[]){
          int max = arr[0];
          for(int i = 0; i< arr.length; i++){
              if (arr[i] > max) {
                  max = arr[i];
              }

          }
          return max;
      }



      static int[] getPosNegSum(int arr[]){
      int negSum = 0;
      int posSum = 0;
      for (int i = 0; i<arr.length; i++){
          if (arr[i] < 0){
              negSum = negSum + arr[i];
          }
          else{
              posSum = posSum + arr[i];
          }
      }
      int res[] = {posSum,negSum};
      return res;
      }



      static int[] getOneZeroCount(int arr[]){
      int zeroCount = 0;
      int oneCount = 0;
      for (int i = 0 ; i< arr.length; i++){
          if (arr[i] == 0){
              zeroCount++;
          } else if (arr[i] == 1) {
              oneCount++;
          }

      }
      int result[] = {zeroCount, oneCount};
      return result;
      }




      static int getUnsortedArraay(int arr[]){
      for (int i = 0 ; i< arr.length; i++){
          if (arr[i+1] <= arr[i]){
              return arr[i+1];
          }

          }
      return -1;
      }











    public static void main(String[] args) {
        int [] arr = {2,4,1,3};
        System.out.println(getAverage(arr));

        int ans[]= multiplyBy10(arr);
        System.out.println(ans);
        for (int i : ans){
            System.out.println(i);
        }

        System.out.println(findTarget(arr,40));


        System.out.println(maxElement(arr));

        int brr[] = {2,-3,-5,-7,9};
        int res[] = getPosNegSum(brr);
        System.out.println("Posititve Sum: " + res[0]);
        System.out.println("Negative Sum: " + res[1]);


        int crr[] = { 1, 0 , 0 , 1 , 0, 1, 1, 1};
        int count[] = getOneZeroCount(crr);
        System.out.println("ZeroCount= " + count[0]);
        System.out.println("OneCount= " + count[1]);


        int drr[] = {1,2,7,5,8,6};
        System.out.println(getUnsortedArraay(drr));
    }
}
