class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        Boolean[] result = new Boolean[candies.length];
        for(int i = 0; i < candies.length; i++) {
            result[i] = candies[i] + extraCandies >= max;
        }
        return Arrays.stream(result).toList();
    }
}