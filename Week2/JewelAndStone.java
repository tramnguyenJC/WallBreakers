class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewels = new HashSet<>();
        for (char jewel : J.toCharArray()) {
            jewels.add(jewel);
        }
        int jewelCounter = 0;
        for (Character stone : S.toCharArray()) {
            if (jewels.contains(stone)) {
                jewelCounter++;
            }
        }
        return jewelCounter;
    }
}