class Solution {
    public int romanToInt(String s) {
        int[] value = new int[128]; // ASCII lookup, O(1) direct indexing, no boxing
        value['I'] = 1;
        value['V'] = 5;
        value['X'] = 10;
        value['L'] = 50;
        value['C'] = 100;
        value['D'] = 500;
        value['M'] = 1000;

        int n = s.length();
        int ans = value[s.charAt(n - 1)];

        for (int i = 0; i < n - 1; i++) {
            int curr = value[s.charAt(i)];
            int next = value[s.charAt(i + 1)];
            ans += (curr < next) ? -curr : curr;
        }

        return ans;
    }
}