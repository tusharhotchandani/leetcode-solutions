class Solution {
public:
    string largestGoodInteger(string num) {
        int n = num.length();
        char maxchar = ' ';

        for(int i=2; i<n; i++){
            if(num[i] == num[i-1]){
                if(num[i]==num[i-2]){
                    if(num[i] > maxchar){
                        maxchar = num[i];
                    }
                }
            }
        }
        if(maxchar == ' ') return "";
        return string(3,maxchar);
    }
};