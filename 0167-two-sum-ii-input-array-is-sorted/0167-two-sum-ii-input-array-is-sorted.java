class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int[] response = new int[2];
        int slow = 0;
        int fast = numbers.length -1;
        while(slow < fast){
            if(numbers[slow] + numbers[fast] == target){
                response[0]=slow+1;
                response[1] = fast+1;
                return response;
            }
            else if(numbers[slow] + numbers[fast] < target){
                slow++;
            }
            else if(numbers[slow] + numbers[fast] > target){
                fast--;
            }
        }
        response[0]=slow+1;
        response[1]=fast+1;
        return response;
    }
}