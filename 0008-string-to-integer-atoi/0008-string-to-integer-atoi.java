class Solution {
   public int myAtoi(String s) {
    if (s == null || s.isEmpty()) {
        return 0;
    }

    int index = 0;
    int sign = 1;
    int result = 0;
    int maxDiv10 = Integer.MAX_VALUE / 10;

    // Step 1: Ignore leading whitespace
    while (index < s.length() && Character.isWhitespace(s.charAt(index))) {
        index++;
    }

    // Step 2: Check for '+' or '-'
    if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
        sign = (s.charAt(index) == '-') ? -1 : 1;
        index++;
    }

    // Step 3: Read digits until a non-digit character is encountered
    while (index < s.length() && Character.isDigit(s.charAt(index))) {
        int digit = Character.getNumericValue(s.charAt(index));

        // Step 4: Check for integer overflow
        if (result > maxDiv10 || (result == maxDiv10 && digit > 7)) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        index++;
    }

    // Step 5: Apply sign
    return result * sign;
}

}