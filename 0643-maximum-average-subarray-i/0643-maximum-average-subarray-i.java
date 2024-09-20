class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;
        double sum = 0;
        int start = 0;
        
        for(int end = 0; end < nums.length; end++) {
            sum += nums[end];
            
            if(end - start + 1 == k) {
                result = Math.max(result, sum / k);
                sum -= nums[start++];
            }
        }
        
        
        return result;
     }
}