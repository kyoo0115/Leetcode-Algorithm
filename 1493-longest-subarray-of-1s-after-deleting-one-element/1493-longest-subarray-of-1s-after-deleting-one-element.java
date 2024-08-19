class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int max = 0;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCount++;
            }
            
            while(zeroCount > 1) {
                if(nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            max = Math.max(max, i - start);
        }

        return max;
    }
}