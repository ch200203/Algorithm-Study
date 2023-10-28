package leetCode.Easy;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 * Runtime: 1 ms
 */
public class PalindromeNumber {
    private boolean isPalindrome(int x) {
        if(String.valueOf(x).length() % 2 == 0 || x <= 0) 
            return false;
        
        String reverseNumber = new StringBuffer(String.valueOf(x)).reverse().toString();
        if(String.valueOf(x).equals(reverseNumber)) {
            return true;
        }

        return false;
    }
}