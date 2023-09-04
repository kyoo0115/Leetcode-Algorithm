class Solution {

    public String addStrings(String num1, String num2) {
        // TODO - Write your code here

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;

        while(p1 >= 0 || p2 >= 0){
            int x1 = 0, x2 = 0;

            if(p1 >= 0){
                x1 = num1.charAt(p1) - '0';
            }
            if(p2 >= 0){
                x2 = num2.charAt(p2) - '0';
            }
            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            result.append(value);
            p1--;
            p2--;
        }
        if(carry != 0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}