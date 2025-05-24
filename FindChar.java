/*Find Words Containing Character
Solved
Easy
Topics
Companies
Hint
You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.

 

Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.*/
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
           String name=words[i];
           for(int j=0;j<name.length();j++){
            if(name.charAt(j)==x){
                list.add(i);
                break;
            }
           }
        }
        return list;
    }
}
