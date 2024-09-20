class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = 0;
        double average = 0;
        
        for(int i = 0; i < k; i++) {
            average += nums[i];
        }
        
        result = average;
        
        for(int i = k; i < nums.length; i++) {
            average += nums[i] - nums[i - k];
            result = Math.max(average, result);
        }
        
        return result / k;
     }
}