class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int length = 0;
        int start = 0;
        int end = 0;

        while(end < s.length()) {
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                length = Math.max(length, end - start);
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return length;
    }
}