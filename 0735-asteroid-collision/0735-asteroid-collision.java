import java.util.ArrayDeque;
import java.util.Deque;

class Solution 
{
    Deque<Integer> stack = new ArrayDeque<>();
    boolean recheck = false;
    
    public int[] asteroidCollision(int[] asteroids) 
    {   
        for(int num : asteroids) {
            if(!stack.isEmpty() && stack.peek() >= 0 && num > 0) {
                stack.push(num);
            }
            else if(!stack.isEmpty() && stack.peek() >= 0 && num < 0 ) {
                int currentNum = num; 
                boolean destroyed = false; 
                recheck = false; 
                
                do {
                    int top = stack.peek();
                    
                    if (Math.abs(currentNum) > Math.abs(top)) {
                        stack.pop();
                        
                        recheck = !stack.isEmpty() && stack.peek() >= 0; 
                    } else if (Math.abs(currentNum) == Math.abs(top)) {
                        stack.pop(); 
                        destroyed = true; 
                        recheck = false; 
                    } else {
                        destroyed = true; 
                        recheck = false; 
                    }
                }
                while(recheck);      
                if (!destroyed) {
                    stack.push(currentNum);
                }
            }
            else if(!stack.isEmpty() && stack.peek() < 0 && num > 0 )
            {
                stack.push(num);
            }
            else { 
                stack.push(num);
            }
        }

        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
