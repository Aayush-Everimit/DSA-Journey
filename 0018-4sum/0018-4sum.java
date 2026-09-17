import java.util.Arrays;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> resultSet = new HashSet<>();
        if (nums == null || nums.length < 4) {
            return new ArrayList<>(resultSet);
        }
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
             if ((long) nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;

             if ((long) nums[i] + nums[n-3] + nums[n-2] + nums[n-1] < target) continue;
           for (int j = i + 1; j < n - 2; j++) {
            if ((long) nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;
            if ((long) nums[i] + nums[j] + nums[n-2] + nums[n-1] < target) continue;
            int left = j+1;
            int right = n-1;
            while(left<right){
                long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                if (sum == target) {
                    resultSet.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if (sum < target) {
                    left++;
                } else {
                    right--;
                }

           }
        }
    }
    return new ArrayList<>(resultSet);
}}