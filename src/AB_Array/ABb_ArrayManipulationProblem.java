package AB_Array;

import java.util.HashMap;

public class ABb_ArrayManipulationProblem {


// 1. Reverse an array using two pointer
// 2. Shift array elements by 1 position
// 3. Print extreme elements in an alternate manner
// 4. Identify elements with highest and lowest frequency
// 5. Find the mode of the array



    static void reverseArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
        // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        // update i & j
            i++;
            j--;
        }
        //print the reversed array
        for(int k : arr){
            System.out.print(k);
        }
        System.out.println();
    }




    static void shiftBy1(int arr[]){
        int n = arr.length;
        int temp = arr[n-1] ;
        for (int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        for(int a: arr){
            System.out.print(a + " ");
        }

    }



    static void printAlternate(int arr[]){
        int n =  arr.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            if (i == j){
                System.out.print(arr[j]);
                return;
            }
            else{
                System.out.print(arr[i]);
                i++;
                System.out.print(arr[j]);
                j--;
            }

        }

    }



    static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;

            }
        }
        return maxFreqKey;
    }


    static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();
        // inserting value to each key
        for (int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        // finding highest frequency number
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for (int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq){
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }

        // finding lowest frequency number
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq){
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;

        }






    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
//        reverseArray(arr);
//        shiftBy1(arr);

        printAlternate(arr);
        System.out.println();

        int brr[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int ans = getMode(brr);
        System.out.print("Mode is "+ans);
        System.out.println();

        int ans1[] = getHighestLowestFreqElement(brr);
        System.out.println("Highest Frequency Elements is " + ans1[0]);
        System.out.println("Lowest Frequency Elements is " + ans1[1]);






    }


}
