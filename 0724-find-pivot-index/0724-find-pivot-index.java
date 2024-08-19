class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for(int i = 0; i < nums.length; i++) {
            
            if(totalSum - leftSum - nums[i] == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}