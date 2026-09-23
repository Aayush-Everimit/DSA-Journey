import java.util.Arrays;

class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freqArr = new int[26];
        int[] windArr = new int[26];

        for(int i = 0 ; i < s1.length() ; i++){
            freqArr[s1.charAt(i)- 'a']++;
            windArr[s2.charAt(i)- 'a']++;
        }
        for(int i = s1.length() ; i<s2.length(); i++){
            if(matches(freqArr , windArr)){
                return true;
            }
            windArr[s2.charAt(i)-'a']++;
            windArr[s2.charAt(i-s1.length()) - 'a']--;
        }
        return matches(freqArr , windArr);
    }
    private boolean matches(int[] a, int[] b){
        for(int i = 0; i<26;i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
