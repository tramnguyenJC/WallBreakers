import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('u');
        vowels.add('i');
        vowels.add('o');

        int leftIdx = 0, rightIdx = s.length() - 1;
        char[] reversedString = new char[s.length];
        while (leftIdx < rightIdx) {
        	if (vowels.contains(s.charAt(leftIdx))) 

        }

        for (int i = 0; i < s.length; i++) {
        	if (s.charAt(i) == )
        	reversedString[l]
        }
    }
}


// Write a function that takes a string as input and reverse only the vowels of a string.

// Example 1:

// Input: "hello"
// Output: "holle"
// Example 2:

// Input: "leetcode"
// Output: "leotcede"
// Note:
// The vowels does not include the letter "y".