class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> uniqueCandies = new HashSet<>();
        int repeats = 0;
        for (int candy : candies) {
            if (uniqueCandies.contains(candy)) repeats++;
            uniqueCandies.add(candy);
        }
        return Math.min( uniqueCandies.size() - (candies.length/2 - repeats),  uniqueCandies.size());
    }
}