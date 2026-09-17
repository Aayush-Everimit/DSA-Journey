class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;

        int[] temp = new int[k];
        System.arraycopy(nums, n - k, temp, 0, k);

        System.arraycopy(nums, 0, nums, k, n - k);

        System.arraycopy(temp, 0, nums, 0, k);
    }
}
