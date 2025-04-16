/*Top K Frequent Elements
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 */
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer>queue=new PriorityQueue<>((a,b)->
        map.get(b)-map.get(a));

        for(int num:map.keySet()){
            queue.add(num);
        }

        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=queue.poll();
        }
        return arr;
       
    }
}
