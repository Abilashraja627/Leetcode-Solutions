/*Max Consecutive Ones
Solved
Easy
Topics
Companies
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current_count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current_count++;
                max = Math.max(max, current_count);
            } else {
                current_count = 0;
            }
        }
        
        return max;
    }
}
