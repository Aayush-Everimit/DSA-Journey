class Solution {     
    public int digitFrequencyScore(int n) {         
        int[] bucket = new int[10];
        
        
        if (n == 0) {
            bucket[0] = 1;
        }

        while (n > 0) {             
            int temp = n % 10;      
            bucket[temp] += 1;      
            n = n / 10;         
        }         

        int result = 0;             
        for (int f = 0; f < 10; f++) {
            result += bucket[f] * f;         
        }         
        return result;     
    } 
}
