import java.util.TreeMap;
import java.util.Comparator;
import java.util.Stack;

class Solution {     
    public int carFleet(int target, int[] position, int[] speed) {         
        
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());         
        for(int i = 0 ; i < position.length ; i ++){             
            map.put(position[i] , speed[i]);           
        }               

        
        double[] time = new double[position.length];
        int index = 0;
        
        
        for(int pos : map.keySet()){
            time[index++] = (double)(target - pos) / map.get(pos); 
        }

        
        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < time.length; i++) {
        
            if(stack.isEmpty() || time[i] > stack.peek()) {
                stack.push(time[i]);
            }
            
        }

        return stack.size(); 
    } 
}
