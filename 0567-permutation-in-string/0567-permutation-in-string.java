import java.util.Arrays;

class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        if (s1.length() > s2.length()) {
            return false;
        }

        char[] str1 = s1.toCharArray();
        Arrays.sort(str1);

        char[] str2 = s2.toCharArray();
        int k = str1.length;

        for (int prev = 0; prev <= str2.length - k; prev++) {
            char[] temp = new char[k];
            for (int i = 0; i < k; i++) {
                temp[i] = str2[prev + i];
            }
            
            Arrays.sort(temp);

            if (Arrays.equals(str1, temp)) {
                return true;
            }
        }    
        return false;
    }
}
