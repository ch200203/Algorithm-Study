package leetCode.Easy;

import java.util.Arrays;

// maximum-count-of-positive-integer-and-negative-integer
// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
public class Solution_2529 {
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
    }

    private int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;

        for (int num : nums) {
            if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            }
        }
        return Math.max(neg, pos);
    }
}
