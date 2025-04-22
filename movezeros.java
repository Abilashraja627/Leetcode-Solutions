/*Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/
class Solution {
    public void moveZeroes(int[] nums) {
      
        int count=0;
        for(int num:nums){
            if(num!=0){
                nums[count]=num;
                count++;
            }
           
        }
         while(count<nums.length){
                nums[count]=0;
                count++;
            }
        for(int num:nums){
            System.out.print(num + " ");
        }
    }
}
