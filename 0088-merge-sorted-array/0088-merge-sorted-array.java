class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int[] merged = new int[m + n];
        int ptr1 = 0;
        int ptr2 = 0;
        int i = 0;

         while (ptr1 < m && ptr2 < n) {
            if (nums1[ptr1] <= nums2[ptr2]) {
                merged[i] = nums1[ptr1];
                ptr1++;
            } else {
                merged[i] = nums2[ptr2];
                ptr2++;
            }
            i++;
        }
        while (ptr1 < m) {
            merged[i] = nums1[ptr1];
            ptr1++;
            i++;
        }

        while (ptr2 < n) {
            merged[i] = nums2[ptr2];
            ptr2++;
            i++;
        }

        for (int k = 0; k < merged.length; k++) {
            nums1[k] = merged[k];
        }
    }
}