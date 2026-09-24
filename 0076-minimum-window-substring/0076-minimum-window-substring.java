class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] freqArray = new int[128];
        for (int i = 0; i < t.length(); i++) {
            freqArray[t.charAt(i)]++; 
        }

        int left = 0;
        int right = 0;
        int required = t.length(); // Total unique character occurrences needed from t
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0; 

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            
            if (freqArray[rightChar] > 0) {
                required--;
            }
            
            freqArray[rightChar]--;
            right++;
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }

                char leftChar = s.charAt(left); 
                freqArray[leftChar]++;
                
                if (freqArray[leftChar] > 0) {
                    required++;
                }
                
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}
