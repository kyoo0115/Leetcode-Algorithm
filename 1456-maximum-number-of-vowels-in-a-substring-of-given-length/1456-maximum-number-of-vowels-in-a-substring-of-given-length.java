class Solution {
    public int maxVowels(String s, int k) {

        int currentSum = 0;
        int maxSum = 0;

        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                currentSum++;
            }
        }

        maxSum = currentSum;

        for(int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                currentSum--;
            }

            if (isVowel(s.charAt(i))) {
                currentSum++;
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}