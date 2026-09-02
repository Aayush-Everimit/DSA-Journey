class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        String str = strs[0];

        for(int i=0;i< strs.length; i++)
        {
            while(strs[i].indexOf(str)!=0)
            {
                str = str.substring(0, str.length()-1);
                if(str.isEmpty())
                {
                    return "";
                }
            }    
        }
        return str;
    }
}