class Solution 
{
    private int index = 0;

    public String decodeString(String s) 
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int num = 0;
        
        while (index < s.length())
        {
            char ch = s.charAt(index);
            
            if (Character.isDigit(ch)) 
            {
                num = num * 10 + Character.getNumericValue(ch);
                index++;
            }
            else if (ch == '[') 
            {
                index++;
                
                String nestedDecoded = decodeString(s);
                
                for (int i = 0; i < num; i++) {
                    temp.append(nestedDecoded);
                }
                
                sb.append(temp);
                temp.setLength(0); 
                num = 0;           
            }
            else if (ch == ']') 
            {
                index++;
                return sb.toString();
            }
            else 
            {
                sb.append(ch);
                index++;
            }
        }
        return sb.toString();
    }
}
