/* Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 */
class Solution {
    public String reverseVowels(String s) {
        StringBuffer sb=new StringBuffer(s);

        int left=0,right=sb.length()-1;
        while(left<right){
           
            while(left<right &&!(isVowel(sb.charAt(left)))){
                left++;
            }
            while(right>left && !(isVowel(sb.charAt(right)))){
                right--;
            }
           
             char ch=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,ch);
             left++;
             right--;
        }
        return sb.toString();
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
