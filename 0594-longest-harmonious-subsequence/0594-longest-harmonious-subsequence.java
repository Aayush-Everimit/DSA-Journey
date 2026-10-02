import java.util.HashMap;

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
       
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        
        int maxLen = 0;
        
       
        for (int key : map.keySet()) {
        
            if (map.containsKey(key + 1)) {
   
                int currentLen = map.get(key) + map.get(key + 1);
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        
        return maxLen;
    }
}
