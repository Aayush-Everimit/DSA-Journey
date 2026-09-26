class Solution {
    public int calPoints(String[] operations) {
        int[] stack = new int[operations.length];
        int top = -1;
        int totalSum = 0; 

        for (String op : operations) {
            char c = op.charAt(0);
            
            if ((c == '-' || Character.isDigit(c)) && op.length() > 0) {
                int value = Integer.parseInt(op);
                stack[++top] = value;
                totalSum += value;
                continue;
            }

            switch (c) {
                case 'C':
                    totalSum -= stack[top--];
                    break;
                    
                case 'D':
                    int doubleValue = 2 * stack[top];
                    stack[++top] = doubleValue;
                    totalSum += doubleValue;
                    break;
                    
                case '+':
                    int plusValue = stack[top] + stack[top - 1];
                    stack[++top] = plusValue;
                    totalSum += plusValue;
                    break;
            }
        }
        
        return totalSum;
    }
}
