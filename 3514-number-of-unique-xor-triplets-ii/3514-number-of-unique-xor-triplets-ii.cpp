class Solution {
public:
    int uniqueXorTriplets(vector<int>& nums) {
        unordered_set<int> dp = {0};
        for(int i=0 ;i<3 ; i++){
            unordered_set<int> ndp;
            for(int a : dp){
                for(int b : nums){
                    ndp.insert(a^b);
                }
            }
            dp = move(ndp);
        }
        
        return dp.size();
    }
};