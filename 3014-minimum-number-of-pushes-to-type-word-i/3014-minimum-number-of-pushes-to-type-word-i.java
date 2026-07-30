class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n<9){
            return n;
        }
        else if(n<17){
            return 8 + 2*(n-8) ;
        }
        else if(n<25){
            return 24 + 3*(n-16) ;
        }
        else{
            return 48 + 4*(n-24) ; 
        }
    }
}