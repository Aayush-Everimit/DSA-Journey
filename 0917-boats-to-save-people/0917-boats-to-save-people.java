import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people); 
        
        int noBoat = 0;
        int left = 0;                 
        int right = people.length - 1; 
        while (left <= right) {
            if (left == right) {
                noBoat++;
                break;
            }
            
            int dif = limit - people[left];
            
            if (dif >= people[right]) {
               
                left++;
                right--;
                noBoat++;
            } else {
                
                right--; 
                noBoat++;
            }
        }
        
        return noBoat;
    }
}
