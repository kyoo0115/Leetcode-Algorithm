class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int sum = 0;
        int left = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                int currentSubArrSize = (i + 1) - left;
                result = Math.min(result, currentSubArrSize);
                sum -= nums[left++];
            }
        }
        if (result != Integer.MAX_VALUE)
            return result;
        else
            return 0;
    }
    }