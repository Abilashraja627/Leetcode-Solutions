/*Summary Ranges

You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"*/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>list=new ArrayList<>();
        int start=0;
        if(nums.length==0){
            return new ArrayList<>();
        }else{
         start=nums[0];
        }
       for(int i=1;i<nums.length;i++){
       if(nums[i]-nums[i-1]!=1){
        if(nums[i-1]==start){
            list.add(String.valueOf(start));
        }
        else{
            list.add(String.valueOf(start) +"->" +String.valueOf(nums[i-1]));
        }
        start=nums[i];
       }
       }
       if(start==nums[nums.length-1]){
        list.add(String.valueOf(start));
       }
       else{
        list.add(String.valueOf(start) +"->" +String.valueOf(nums[nums.length-1]));
       }
       return list;
    }
}
