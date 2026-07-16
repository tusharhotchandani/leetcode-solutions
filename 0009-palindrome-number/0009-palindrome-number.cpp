class Solution {
public:
    bool isPalindrome(int x) {
        if(x>=0){
            int a = x;
            long int b = 0;
            while(a>0){
                int d = a%10;
                b = 10*b + d  ;
                a = a/10 ;
            }
            if(b==x){
                return true;
            }        
        }
        return false;
    }
};