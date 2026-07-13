package AB_Array;

public class ABc_TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int n=nums.length;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (nums[i] + nums[j] == target){
                    int ans[] ={i,j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int res[] = twoSum(arr,9);
//        System.out.println(res[0],res[1]);
    }

}
