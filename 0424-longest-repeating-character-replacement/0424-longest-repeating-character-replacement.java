class Solution {

    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;

        int[] freq = new int[26];
        char[] str = s.toCharArray();

        for (int right = 0; right < str.length; right++) {

            freq[str[right] - 'A']++;

            maxFreq = Math.max(maxFreq, freq[str[right] - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                freq[str[left] - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}