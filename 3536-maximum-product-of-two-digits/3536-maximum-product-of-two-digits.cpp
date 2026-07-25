class Solution {
public:
    int maxProduct(int n) {
        vector<int> arr;
        int digit;
        while(n>0){
            digit = n%10;
            arr.push_back(digit);
            n = n/10;
        }
        int maxp = 0;
        int product = 0;
        for(int i = 0 ; i<arr.size() ; i++){
            for(int j = i+1 ; j<arr.size() ; j++){
                product = arr[i] * arr[j];
                if(product > maxp){
                    maxp = product;
                }
            }
        }
        return maxp;
    }
};