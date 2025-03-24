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

Output: [["a"]]*/
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store grouped anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Loop through each word in the given array
        for (String word : strs) {
            // Convert the word into a character array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars); // Convert back to a string

            // If the sorted word is not in the map, add it with a new list
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // Add the original word to the corresponding group
            map.get(sortedWord).add(word);
        }

        // Convert the map values (lists of anagrams) into a single list and return
        return new ArrayList<>(map.values());
    }
}
