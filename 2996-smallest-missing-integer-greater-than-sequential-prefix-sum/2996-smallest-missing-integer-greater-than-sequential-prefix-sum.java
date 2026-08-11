class Solution {
    public int missingInteger(int[] nums) {

        // Step 1: Find sequential prefix sum
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Step 2: Find the smallest integer >= sum
        // that is not present in the array
        int answer = sum;

        while (true) {

            boolean found = false;

            for (int num : nums) {
                if (num == answer) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return answer;
            }

            answer++;
        }
    }
}