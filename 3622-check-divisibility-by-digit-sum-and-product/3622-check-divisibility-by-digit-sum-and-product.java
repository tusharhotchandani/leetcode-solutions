class Solution {
    public boolean checkDivisibility(int n) {
        
        int number = n ;
        int digsum =0;
        int digpro = 1;
        int digit = 0;

        while(n>0){
            digit = n%10;
            digsum += digit;
            digpro *= digit;
            n = n/10;
        }
        int sum = digsum + digpro;
        if(number%sum == 0) return true;
        return false;
    }
}