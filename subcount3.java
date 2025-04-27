/*Count Subarrays of Length Three With a Condition
Solved
Easy
Topics
Companies
Hint
Given an integer array nums, return the number of subarrays of length 3 such that the sum of the first and third numbers equals exactly half of the second number.
Example 1:

Input: nums = [1,2,1,4,1]

Output: 1

Explanation:

Only the subarray [1,4,1] contains exactly 3 elements where the sum of the first and third numbers equals half the middle number.*/
class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            float s=nums[i+1];
            float k=2*(nums[i]+nums[i+2]);
            if(s==k){
                count++;
            }
        }
        return count;
    }
}
