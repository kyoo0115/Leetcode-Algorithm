class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        for(int i : nums){
            if(!set.contains(i - 1)){
                int length = 0;
                while(set.contains(i + length)){
                    length += 1;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}