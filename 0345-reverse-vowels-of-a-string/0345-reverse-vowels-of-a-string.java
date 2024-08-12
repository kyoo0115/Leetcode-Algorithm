class Solution {
     public String reverseVowels(String s) {
         char[] arr = s.toCharArray();
         int left = 0;
         int right = s.length() - 1;
         
         while(left < right) {
             if(!isVowel(arr[left])) {
                 left++;
                 continue;
             }
             
             if(!isVowel(arr[right])) {
                 right--;
                 continue;
             }
             
             char temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
             
             left++;
             right--;
         }
         return new String(arr);
     }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}