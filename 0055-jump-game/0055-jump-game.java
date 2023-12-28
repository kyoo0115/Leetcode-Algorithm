class Solution {
    public static boolean canJump(int[] nums) {
        int last = nums.length - 1;
        int maxReach = 0;
        for (int i = 0; i <= maxReach; i++) {
            int currentReach = i + nums[i];
            maxReach = Math.max(maxReach, currentReach);

            if (maxReach >= last) {
                return true;
            }
        }
        return false;
    }
}