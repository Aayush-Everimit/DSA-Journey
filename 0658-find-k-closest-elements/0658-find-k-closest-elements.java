import java.util.ArrayList;
import java.util.List;

class Solution 
{
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        
        while (right - left + 1 > k) {
            
            if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                right--;
            } else {
                left++;
            }
        }
        
        for (int i = left; i <= right; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
