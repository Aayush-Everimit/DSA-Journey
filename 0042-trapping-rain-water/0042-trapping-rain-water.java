import java.util.ArrayDeque;
class Solution 
{
    
    public int trap(int[] height) 
    {
        int totalWater = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0 ; i < height.length; i++){
            while(!stack.isEmpty() && height[i]>height[stack.peek()]){
                int bottomInd = stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int leftIndex = stack.peek();
                int width = i - leftIndex-1;
                int boundedHeight = Math.min(height[leftIndex] , height[i]) - height[bottomInd];
                totalWater += width*boundedHeight;
            }
            stack.push(i);
        }
        return totalWater;
    }
}