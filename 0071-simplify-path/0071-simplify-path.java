class Solution 
{
    public String simplifyPath(String path) 
    {
        String[] parts = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for(String part : parts){
            if (part.isEmpty() || part.equals(".")) 
            {
                continue;
            }
            if (part.equals("..")) 
            {
                if (!stack.isEmpty()) 
                {
                    stack.pop();
                }
            } 
            else 
            {
                stack.push(part);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.pollLast());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}