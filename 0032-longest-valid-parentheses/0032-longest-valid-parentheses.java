class Solution {

    public int longestValidParentheses(String s) {

        int maxLength = 0;
        int leftParenthesis = 0;
        int rightParenthesis = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar == '('){
                leftParenthesis++;
            }
            else{
                rightParenthesis++;
            }
            if(leftParenthesis == rightParenthesis){
                maxLength = Math.max(maxLength, 2 * rightParenthesis);
            }
            else if(leftParenthesis < rightParenthesis){
                leftParenthesis = 0;
                rightParenthesis = 0;
            }
        }
        leftParenthesis = rightParenthesis = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                leftParenthesis++;
            } else {
                rightParenthesis++;
            }
            if (leftParenthesis == rightParenthesis) {
                maxLength = Math.max(maxLength, 2 * leftParenthesis);
            } else if (leftParenthesis > rightParenthesis) {
                leftParenthesis = rightParenthesis = 0;
            }
        }
        return maxLength;
    }
}