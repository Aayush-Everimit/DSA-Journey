import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);

        int longestSequence = 1;
        int currentSequence = 1;

        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                currentSequence++;
                longestSequence = Math.max(longestSequence, currentSequence);
            } 
            
            else if (nums[i] == nums[i + 1]) {
                continue; 
            } 
            else {
                currentSequence = 1;
            }
        }
        return longestSequence;
    }
}
