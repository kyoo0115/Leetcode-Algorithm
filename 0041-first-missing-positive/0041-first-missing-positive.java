class Solution {
    public int firstMissingPositive(int[] nums) {
    int n = nums.length;
    
    // Step 1: Mark all negative values and zeros as (n + 1)
    for (int i = 0; i < n; i++) {
        if (nums[i] <= 0) {
            nums[i] = n + 1;
        }
    }

    // Step 2: Mark visited indices
    for (int i = 0; i < n; i++) {
        int val = Math.abs(nums[i]);
        if (val <= n) {
            nums[val - 1] = -Math.abs(nums[val - 1]);
        }
    }

    // Step 3: Find the first unmarked index
    for (int i = 0; i < n; i++) {
        if (nums[i] > 0) {
            return i + 1;
        }
    }

    // If all indices are marked, return n + 1
    return n + 1;
}

}