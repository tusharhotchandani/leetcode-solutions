class Solution {
    public int pivotIndex(int[] nums) {
        int lSum = 0;
        int rSum = Arrays.stream(nums).sum();
        for(int i =0; i< nums.length ; i++){
            if(i==0){
                lSum = 0;
                rSum = rSum - nums[0];
            }
            else{
                lSum = lSum + nums[i-1];
                rSum = rSum - nums[i];
            }

            if(lSum == rSum){
                return i;
            }
        }
        return -1;
    }
}