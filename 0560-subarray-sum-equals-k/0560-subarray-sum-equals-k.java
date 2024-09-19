class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int sum = 0;
        Map<Integer, Integer> occurence = new HashMap<>();  
        
        occurence.put(0, 1);
        
        for(int num : nums) {
            sum += num;
            
            if(occurence.containsKey(sum - k)) {
                result += occurence.get(sum - k);
            }
            
            occurence.put(sum, occurence.getOrDefault(sum, 0) + 1);
        }
        
        return result;
     }
}