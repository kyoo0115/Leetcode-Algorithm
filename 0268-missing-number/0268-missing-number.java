class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int totalSum = 0;
        
        for(int i : nums) {
            sum += i;
        }
        
        for(int i = 1; i <= nums.length; i++) {
            totalSum += i;
        }
        
        return totalSum - sum;
    }
}