import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < operations.length ; i++){
           
            if(!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+")){
                stack.push(Integer.parseInt(operations[i]));
            }
            if(operations[i].equals("C") && !stack.isEmpty()){
                stack.pop();
            }
            if(operations[i].equals("D")){
                if(!stack.isEmpty()) {
                    stack.push(2 * stack.peek());
                }
            }
            if(operations[i].equals("+")){
                if (stack.size() >= 2) {
                    int prev1 = stack.pop();
                    int prev2 = stack.pop(); 
                    stack.push(prev2); 
                    stack.push(prev1); 
                    stack.push(prev1 + prev2); 
                } else if (stack.size() == 1) {
                    int prev1 = stack.peek();
                    stack.push(prev1);
                }
            }
        }
        
        int result = 0;
        for(int i : stack){
            result += i;
        }
        return result;
    }
}
