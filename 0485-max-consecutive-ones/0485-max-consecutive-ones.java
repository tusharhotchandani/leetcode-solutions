class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxc = 0;
        int count =0;
        for(int n : nums){
            if(n==1){
                count ++;
            }
            else{
                maxc = Math.max(maxc,count);
                count = 0;
            }
        }
        return Math.max(maxc,count);
    }
}