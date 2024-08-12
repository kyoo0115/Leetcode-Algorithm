class Solution {
    public String reverseWords(String s) {
        String trimmed = s.trim();
        String removeWhiteSpace = trimmed.replaceAll("\\s+", " ");
        String[] split = removeWhiteSpace.split(" ");

        int left = 0;
        int right = split.length - 1;
        while(left < right) {
            String temp = split[left];
            split[left] = split[right];
            split[right] = temp;
            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();

        for (String string : split) {
            sb.append(string).append(" ");
        }

        if(!sb.isEmpty()) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }
}