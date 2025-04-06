/*Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

 */
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>>map=new HashMap<>();

      for(String word:strs){
        char[] currentword=word.toCharArray();
        Arrays.sort(currentword);

        String name=new String(currentword);
        if(!map.containsKey(name)){
            map.put(name,new ArrayList<>());
            
        }
        map.get(name).add(word);
      }
      return new ArrayList<>(map.values());
    }
}
