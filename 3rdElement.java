/*Third Maximum Number
Solved
Easy
Topics
Companies
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.*/
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // Use TreeSet to store unique elements in descending order
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        
        for (int num : nums) {
            set.add(num);
        }
        
        // If there are fewer than 3 distinct numbers, return the max
        if (set.size() < 3) {
            return set.first(); // max element
        }

        // Remove the first (max) and second max elements to get third max
        set.pollFirst(); // remove max
        set.pollFirst(); // remove second max
        return set.first(); // now this is the third max
    }
}
