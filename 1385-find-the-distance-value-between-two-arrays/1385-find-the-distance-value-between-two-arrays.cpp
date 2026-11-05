class Solution {
public:
    int findTheDistanceValue(vector<int>& arr1, vector<int>& arr2, int d) {

        int result =0;
        for(int i=0; i<arr1.size(); i++){
            bool c = true;
            for(int j=0; j<arr2.size(); j++){
                if( ( (arr1[i]>arr2[j]) ? (arr1[i]-arr2[j]) : (arr2[j]-arr1[i]) )<= d){
                    c = false;
                    break;
                }
            }

            if(c){
                result++;
            }
        }
        return result;
    }
};