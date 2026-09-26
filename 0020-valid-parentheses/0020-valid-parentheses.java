class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        
        if (chars.length % 2 != 0) return false;
        
        char[] stack = new char[chars.length];
        int top = -1;

        for (char c : chars) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack[++top] = c;
                    break;
                
                case ')':
                    if (top == -1 || stack[top--] != '(') return false;
                    break;
                case ']':
                    if (top == -1 || stack[top--] != '[') return false;
                    break;
                case '}':
                    if (top == -1 || stack[top--] != '{') return false;
                    break;
            }
        }
        return top == -1;
    }
}
