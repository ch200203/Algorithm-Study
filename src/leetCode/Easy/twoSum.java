package leetCode.Easy;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * Runtime : 9ms
 */
public class twoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;

        int[] answer = {1,2};

        System.out.println(twoSum(nums, target) == answer);
    } 

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                System.out.println(i + " , " + j);
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            } 
        }
        return result;
    }  
}
