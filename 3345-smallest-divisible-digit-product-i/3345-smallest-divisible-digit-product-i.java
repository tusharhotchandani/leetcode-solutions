class Solution {
    public int productDigit(int n){
        int digit=0;
        int p=1;
        while(n>0){
            digit = n%10;
            p = p*digit;
            n = n/10;
        }
        return p;
    }

    public int smallestNumber(int n, int t) {
        while(true){
            if(productDigit(n)%t == 0) return n;
            n = n+1;
        }
    }
}