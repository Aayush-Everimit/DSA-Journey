class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        char[] arr = s.toCharArray();
        for(int right = 0 ; right < arr.length ; right++){
            while(set.contains(arr[right])){
                set.remove(arr[left++]);
            }
            set.add(arr[right]);
            maxLength = Math.max(maxLength , right-left + 1);
        }
        return maxLength;
    }
}