class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer , Integer>();
        for( int i = 0 ; i < nums.length ; i ++){
            int current = nums[i];
            int complement = target - current;
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(current , i);
        }
        return new int[0];
    }
}