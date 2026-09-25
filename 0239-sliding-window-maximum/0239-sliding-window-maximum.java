import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < k || k <= 0) {
            return new int[0]; 
        }
        int ns = nums.length - k + 1;
        int[] result = new int[ns];
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < k; i++) {
            maxHeap.add(new int[]{nums[i], i});
        }
        int j = 0;
        result[j++] = maxHeap.peek()[0];
        for (int i = k; i < nums.length; i++) {
            maxHeap.add(new int[]{nums[i], i});
            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll(); 
            }
            result[j++] = maxHeap.peek()[0];
        }
        return result;
    }
}
