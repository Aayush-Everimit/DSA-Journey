import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        HashSet<List<Integer>> setOfLists = new HashSet<>();
        
        

        for(int slow = 0 ; slow < nums.length - 2 ; slow++){ 
            
            int left = slow + 1;
            int right = nums.length - 1;
            
            while(left < right){
                if(nums[slow] + nums[left] + nums[right] == 0){
                    
                    setOfLists.add(new ArrayList<>(List.of(nums[slow], nums[left], nums[right])));
                    
                    left++;
                    right--;
                }
                else if(nums[slow] + nums[left] + nums[right] < 0){
                    left++;
                }
                else if(nums[slow] + nums[left] + nums[right] > 0){
                    right--;
                }
            }
        }
        List<List<Integer>> resultList = new ArrayList<>(setOfLists);
        return resultList;
    }
}
