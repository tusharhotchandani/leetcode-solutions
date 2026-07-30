class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans;
        if(n<9){
            ans = n;
            return ans;
        }
        else if(n<17){
            ans = 8 + 2*(n-8) ;
            return ans ;
        }
        else if(n<25){
            ans = 24 + 3*(n-16);
            return ans ;
        }
        else{
            ans = 48 + 4*(n-24);
            return ans ; 
        }
    }
}