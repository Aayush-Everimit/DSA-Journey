class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String token : tokens){
            if (token.equals("+")){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first+second);
            }
            else if (token.equals("-")){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second-first);
            }
            else if (token.equals("*")){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first*second);
            }
            else if (token.equals("/")){
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second/first);
            }

           else{ stack.push(Integer.parseInt(token));}
        }
        return stack.peek();
    }
}