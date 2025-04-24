/*ajority Element II
Solved
Medium
Topics
Companies
Hint
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]*/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
      Map<Integer,Integer>map=new HashMap<>();
      List<Integer>list=new ArrayList<>();
      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);

      }
      for(int num:map.keySet()){
        int s=map.get(num);
        if(s>n/3){
            list.add(num);
        }
      }
      return list;
    }
}
