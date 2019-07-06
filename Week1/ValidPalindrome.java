class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        int leftIdx = 0;
        int rightIdx = s.length() - 1;
        while (leftIdx < rightIdx) {
            while(leftIdx < s.length() && s.charAt(leftIdx) == ' ') {
                leftIdx++;
            }
            while(rightIdx >= 0 && s.charAt(rightIdx) == ' ') {
                rightIdx--;
            }
            if (leftIdx < s.length () && rightIdx >= 0 && Character.toLowerCase(s.charAt(leftIdx)) != 
                Character.toLowerCase(s.charAt(rightIdx))) {
                return false;
            }
        }
        return true;
    }
}


// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

// Note: For the purpose of this problem, we define empty string as valid palindrome.

// Example 1:

// Input: "A man, a plan, a canal: Panama"
// Output: true
// Example 2:

// Input: "race a car"
// Output: false