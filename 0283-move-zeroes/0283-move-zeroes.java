class Solution {
       public  void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0){
                nums[lastNonZeroIndex++] = nums[i];
            }
        }
        while(lastNonZeroIndex < n){
            nums[lastNonZeroIndex++] = 0;
        }
    }
}