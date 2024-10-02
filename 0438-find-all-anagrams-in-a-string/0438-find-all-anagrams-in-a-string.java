class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> currentMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int start = 0;
        
        for(char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int end = 0; end < s.length(); end++) {
            currentMap.put(s.charAt(end), currentMap.getOrDefault(s.charAt(end), 0) + 1);
            
            if(end - start + 1 == p.length()) {
                if(currentMap.equals(map)) {
                    result.add(start);
                }
                
                char leftChar = s.charAt(start);
                if(currentMap.containsKey(leftChar)) {
                    currentMap.put(leftChar, currentMap.get(leftChar) - 1);
                    
                    if (currentMap.get(leftChar) == 0) {
                        currentMap.remove(leftChar);
                    }
                }
                start++;
            }
        }

        return result;
    }
}