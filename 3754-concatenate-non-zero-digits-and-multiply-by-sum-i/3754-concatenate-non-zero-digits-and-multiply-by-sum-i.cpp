class Solution {
public:
    long long sumAndMultiply(int n) {
        long long int x = 0;
        int sum =0;
        int i =0 ;
        while(n>0){
            int dig = n%10;
            if(dig != 0){
                sum = sum + dig;
                x = pow(10,i)*dig + x ;
                i++;
            }
            n = n/10;
        }
        return x*sum;
    }
};