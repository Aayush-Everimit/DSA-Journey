import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        List<Integer> list = new ArrayList<>();
        int left = 0; 

        for (int right = k; right < arr.length; right++) {
            int incomingDiff = Math.abs(arr[right] - x);
            int leavingDiff = Math.abs(arr[left] - x);
            if (incomingDiff < leavingDiff) {
                left++;
            } else if (incomingDiff == leavingDiff && arr[right] < arr[left]) {
                left++;
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(arr[left + i]);
        }
        return list;
    }
}
