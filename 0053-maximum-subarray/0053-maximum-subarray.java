class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int current_sum = maxSum;
        
        for(int i = 1; i < nums.length; i++) {
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            maxSum = Math.max(current_sum, maxSum);
        }
        
        return maxSum;
    }
}