class Solution 
{
    public boolean validPalindrome(String s) 
    {
        int left = 0; 
        int right = s.length() - 1;
        int count = 0;
        boolean path1Valid = true;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                count++;
                if (count > 1) { 
                    path1Valid = false; 
                    break; 
                }
                left++; 
                continue; 
            }
            left++;
            right--;
        }
    
        if (path1Valid) return true;

        left = 0;
        right = s.length() - 1;
        count = 0;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                count++;
                if (count > 1) { 
                    return false;
                }
                right--;
                continue; 
            }
            left++;
            right--;
        }
        
        return true;
    }
}
