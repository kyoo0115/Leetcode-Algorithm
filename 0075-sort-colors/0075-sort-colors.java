class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int current = 0;
        int temp;

        while(current <= end){

            if(nums[current] == 2){
                temp = nums[current];
                nums[current] = nums[end];
                nums[end--] = temp;
            }
            else if(nums[current] == 0){
                temp = nums[start];
				nums[start++] = nums[current];
				nums[current++] = temp;
            }
            else{
                current++;
            }
        }
    }
}