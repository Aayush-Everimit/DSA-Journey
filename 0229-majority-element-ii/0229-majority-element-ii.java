import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> countMap = new HashMap<>();
    
        for (int num : nums) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 1); 
            } else {
                countMap.put(num, countMap.get(num) + 1);
            }
        }

        int target = nums.length / 3;
    
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > target) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
}
