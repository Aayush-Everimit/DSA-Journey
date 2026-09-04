class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++)
        {
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count + 1);

            if(map.get(nums[i])>nums.length/2 ){
                return nums[i];
            }
        }
        return -1;
        
    }
}