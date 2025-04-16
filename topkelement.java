/*Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.*/
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String name:words){
            map.put(name,map.getOrDefault(name,0)+1);
        }

        PriorityQueue<String>queue=new PriorityQueue<>((a,b)->{
            int freq=map.get(b)-map.get(a);
            if(freq==0){
                return a.compareTo(b);
            }
            return freq;
        });
        
        
        for(String name:map.keySet()){
            queue.add(name);
        }
        List<String>list=new ArrayList<>();
        for(int i=0;i<k&& !queue.isEmpty();i++){
            list.add(queue.poll());
        }

        return list;
    }
}
