class Solution {
    public static boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            alphabet.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++){
            for (int j = 0; j < words[i].length(); j++){
                if(j >= words[i + 1].length()){
                    return false;
                }
                if(words[i].charAt(j) != words[i + 1].charAt(j)){
                    if (alphabet.get(words[i].charAt(j)) > alphabet.get(words[i + 1].charAt(j))) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }
        return true;
    }
}