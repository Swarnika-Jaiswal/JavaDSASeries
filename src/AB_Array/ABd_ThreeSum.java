package AB_Array;

import java.util.*;

public class ABd_ThreeSum {
    public static Set<List<Integer>> threeSum(int[] nums){

        Set<List<Integer>> output = new HashSet<>();

        int n= nums.length;
        int target = 0;
        for (int i=0; i<n-2; i++){
            for (int j=i+1; j<n-1; j++){
                for (int k=j+1; k<n; k++){
                    if (nums[i] + nums[j] + nums[k] == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        output.add(temp);
                    }
                }
            }
        }
        return new Set<List<Integer>>(output) {
        } ;
    }


    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = threeSum(arr);

        System.out.println(ans);
    }
}
