class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String , List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length ; i++){
            String word = strs[i];
            char[] chr = word.toCharArray();

            Arrays.sort(chr);
            String sortedKey = new String(chr);

            if(!map.containsKey(sortedKey)){
                map.put(sortedKey , new ArrayList<>());
            }
            map.get(sortedKey).add(word);
        }
        return new ArrayList<>(map.values());
    }
}