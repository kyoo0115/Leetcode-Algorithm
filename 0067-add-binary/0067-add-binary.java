class Solution {
    public static String addBinary(String a, String b) {
        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;

        while(p1 >= 0 || p2 >= 0 || carry == 1){
            if (p1 >= 0) {
                carry += a.charAt(p1--) - '0';
            }
            if (p2 >= 0) {
                carry += b.charAt(p2--) - '0';
            }
            result.append(carry % 2);
            carry /= 2;
        }
        return result.reverse().toString();
    }
}