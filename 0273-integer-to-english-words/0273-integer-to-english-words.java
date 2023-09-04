class Solution {
     private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num);
    }
    public String helper(int nums){
        String result;
        if(nums < 20){
            result = LESS_THAN_20[nums];
        }
        else if(nums < 100){
            result = TENS[nums / 10] + " " + helper(nums % 10);
        }
        else if(nums < 1000){
            result = helper(nums / 100) + " Hundred " + helper(nums % 100);
        }
        else if(nums < 1000000) {
            result = helper(nums / 1000) + " Thousand " + helper(nums % 1000);
        }
        else if (nums < 1000000000) {
            result = helper(nums / 1000000) + " Million " + helper(nums % 1000000);
        }
        else {
            result = helper(nums / 1000000000) + " Billion " + helper(nums % 1000000000);
        }
        return result.trim();
    }
}