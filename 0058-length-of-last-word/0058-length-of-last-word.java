class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        int n = word.length -1;
        int ans = word[n].length();
        return ans;
        
    }
}