class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        // sum prefix
        for(int i=1; i<nums.length ; i++){
            if(nums[i] == nums[i-1]+1){
                sum += nums[i];
            }else{
                break;
            }    
        }

        // searching it
        int answer = sum;
        while(true){
            boolean found = false;
            for(int num : nums){
                if(num == answer){
                    found = true;
                    break;
                }
            }
            if(!found){
                return answer;
            }
            answer++;
        }
    }
}