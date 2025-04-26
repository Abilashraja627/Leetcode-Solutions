/* First Unique Character in a String
Solved
Easy
Topics
Companies
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.*/
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int n=0;
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                return n;
            }
           
                n++;
            
        }
            return -1;
        
    }
}
