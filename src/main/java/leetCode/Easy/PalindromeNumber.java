package leetCode.Easy;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 * Runtime: 1 ms
 */
public class PalindromeNumber {
    private boolean isPalindrome(int x) {
        if (x < 0) return false;

        String str = String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}