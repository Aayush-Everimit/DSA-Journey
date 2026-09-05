import java.util.*;

class Solution 
{

    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int count = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] == null) continue;
    
            for (int num : bucket[i]) {
                result[count++] = num;
                if (count == k) return result;
            } 
        }

        return result;
    }
}
