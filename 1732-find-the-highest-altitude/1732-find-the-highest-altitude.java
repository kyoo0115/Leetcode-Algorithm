class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int[] prefixSum = new int[gain.length];
        prefixSum[0] = gain[0];
        
        for (int i = 1; i < gain.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + gain[i];
        }
        
        for (int i = 0; i < gain.length; i++) {
            result = Math.max(result, prefixSum[i]);
        }
        
        return result;
    }
}