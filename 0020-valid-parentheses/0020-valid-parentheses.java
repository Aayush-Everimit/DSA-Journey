import java.util.Stack;

class Solution 
{
    public boolean isValid(String s) 
    {
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        
        
        for(int i = 0 ; i < s.length() ; i++ ){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
                stack.push(s.charAt(i));
            }
            
            if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}' ){
                try{
                    if(s.charAt(i) == ')'){
                        if(stack.peek() != '('){return false;}
                        stack.pop();
                    }
                   
                    if(s.charAt(i) == ']'){
                        if(stack.peek() != '['){return false;}
                        stack.pop();
                    }
                    if(s.charAt(i) == '}'){
                        if(stack.peek() != '{'){return false;}
                        stack.pop(); 
                    }
                }
                catch(Exception e){
                    return result;
                }
            }
        }
        result = stack.isEmpty();
        return result;
    }
}
