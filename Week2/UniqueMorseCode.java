class Solution {
    public int uniqueMorseRepresentations(String[] words) { 
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> transformations = new HashSet<>();
        for (String word : words) {
            String transformation = "";
            for (Character c : word.toCharArray()) {
                transformation += morseCodes[(int)(c) - (int)'a'];
            }
            transformations.add(transformation);
        }
        return transformations.size();
    }                           
                                    
}