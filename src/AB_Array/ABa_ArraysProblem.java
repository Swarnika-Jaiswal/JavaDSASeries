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



  static boolean findTarget(int arr[], int target){
      for (int i=0; i<arr.length; i++){
          if(arr[i] == target){
              return true;
          }
      }
      return false;
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


    }
}
