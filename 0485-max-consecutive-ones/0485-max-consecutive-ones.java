class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxc = 0;
        int count =0;
        for(int n : nums){
            if(n==1){
                count ++;
                if(count >= maxc) maxc = count;
            }
            else{
                count = 0;
            }
        }
        return maxc;
    }
}