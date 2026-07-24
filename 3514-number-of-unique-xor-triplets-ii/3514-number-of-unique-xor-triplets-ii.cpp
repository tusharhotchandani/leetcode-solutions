class Solution {
public:
    int uniqueXorTriplets(vector<int>& nums) {
        unordered_set<int> pairXor;
        for(int p : nums){
            for(int v : nums){
                pairXor.insert(p^v);
            }
        }

        unordered_set<int> ans;
        for(int a : pairXor){
            for(int b : nums){
                ans.insert(a^b);
            }
        }
        return ans.size();
    }
};