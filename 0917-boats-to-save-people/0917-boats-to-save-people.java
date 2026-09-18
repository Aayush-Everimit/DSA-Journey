import java.util.HashMap;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int numberBoat = 0;

        for (int wt : people) {
            map.put(wt, map.getOrDefault(wt, 0) + 1);
        }
        
      
        for (int wt : people) {
            
            if (map.getOrDefault(wt, 0) == 0) {
                continue;
            }
            
            map.put(wt, map.get(wt) - 1);
            numberBoat++; 
   
            int diff = limit - wt;
            
           
            while (diff > 0) {
                if (map.getOrDefault(diff, 0) > 0) {
                    map.put(diff, map.get(diff) - 1);
                    break;
                }
                diff--; 
            }
        }
        
        return numberBoat;
    }
}
