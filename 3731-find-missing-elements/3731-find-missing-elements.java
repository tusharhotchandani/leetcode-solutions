class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
        Set<Integer> present = new HashSet<>();
        for (int x : nums) {
            mn = Math.min(mn, x);
            mx = Math.max(mx, x);
            present.add(x);
        }
        List<Integer> ans = new ArrayList<>();
        for (int x = mn + 1; x < mx; x++) {
            if (!present.contains(x)) ans.add(x);
        }
        return ans;
    }
}