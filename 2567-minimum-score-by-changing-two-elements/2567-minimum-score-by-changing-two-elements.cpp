class Solution {
public:
    int minimizeSum(vector<int>& nums) {
        int n = nums.size();
        if (n == 3) return 0;

        int mn1 = INT_MAX, mn2 = INT_MAX, mn3 = INT_MAX;
        int mx1 = INT_MIN, mx2 = INT_MIN, mx3 = INT_MIN;

        for (int x : nums) {
            // three smallest (mn1 <= mn2 <= mn3)
            if (x < mn1) { mn3 = mn2; mn2 = mn1; mn1 = x; }
            else if (x < mn2) { mn3 = mn2; mn2 = x; }
            else if (x < mn3) { mn3 = x; }

            // three largest (mx1 >= mx2 >= mx3)
            if (x > mx1) { mx3 = mx2; mx2 = mx1; mx1 = x; }
            else if (x > mx2) { mx3 = mx2; mx2 = x; }
            else if (x > mx3) { mx3 = x; }
        }

        return min({ mx3 - mn1,    // drop two largest
                     mx2 - mn2,    // drop largest and smallest
                     mx1 - mn3 }); // drop two smallest
    }
};