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
                boolean destroyed = false; // Tracks if the current incoming asteroid explodes
                recheck = false; 
                
                do {
                    int top = stack.peek();
                    
                    if (Math.abs(currentNum) > Math.abs(top)) {
                        stack.pop(); // Top explodes.
                        // Only recheck if the stack isn't empty AND the next top is positive
                        recheck = !stack.isEmpty() && stack.peek() >= 0; 
                    } else if (Math.abs(currentNum) == Math.abs(top)) {
                        stack.pop(); // Both explode
                        destroyed = true; 
                        recheck = false; 
                    } else {
                        destroyed = true; // Incoming asteroid explodes, top survives
                        recheck = false; 
                    }
                }
                while(recheck);      
                
                // If the incoming negative asteroid cleared the obstacles, push it
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
