class Solution 
{
    public boolean isHappy(int n) 
    {
        int slow = n;
        int fast = n;

        do{
            slow = sumOfSquaredDigits(slow);
            fast = sumOfSquaredDigits(sumOfSquaredDigits(fast));

            if(fast == 1){
                return true;
            }
        }
        while(slow != fast);
        return false;
    }
    public int sumOfSquaredDigits(int n) {
    int sum = 0;
    while (n > 0) {
        int digit = n % 10;
        sum += digit * digit;   
        n = n / 10;            
    }
    
    return sum;
}

}