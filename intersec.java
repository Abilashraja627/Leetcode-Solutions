/*Intersection of Two Arrays II
Solved
Easy
Topics
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.*/
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> set1 = new HashMap<>();
        HashMap<Integer, Integer> set2 = new HashMap<>();

        for (int n : nums1) {
            set1.put(n, set1.getOrDefault(n, 0) + 1);
        }
        for (int n : nums2) {
            set2.put(n, set2.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int n : set1.keySet()) {
            if (set2.containsKey(n)) {
                // Take the minimum count of both for intersection
                int times = Math.min(set1.get(n), set2.get(n));
                for (int i = 0; i < times; i++) {
                    list.add(n);
                }
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
