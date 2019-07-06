class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> uncommonWords = new ArrayList<>();
        HashMap<String, Integer> AWordFreqMap = getWordFrequencyMap(A);
        HashMap<String, Integer> BWordFreqMap = getWordFrequencyMap(B);
        for (Map.Entry<String, Integer> entry : AWordFreqMap.entrySet()) {
            if (BWordFreqMap.containsKey(entry.getKey())) continue;
            else if (entry.getValue() > 1) continue;
            uncommonWords.add(entry.getKey());
        }
        for (Map.Entry<String, Integer> entry : BWordFreqMap.entrySet()) {
            if (AWordFreqMap.containsKey(entry.getKey())) continue;
            else if (entry.getValue() > 1) continue;
            uncommonWords.add(entry.getKey());
        }
        return uncommonWords.toArray(new String[uncommonWords.size()]);
    }
    
    private HashMap<String, Integer> getWordFrequencyMap(String sentence) {
        HashMap<String, Integer> wordFreqMap = new HashMap<>();
        for (String word : sentence.split(" ")) {
            int freq = (wordFreqMap.containsKey(word)) ? wordFreqMap.get(word) + 1 : 1;
            wordFreqMap.put(word, freq);
        }
        return wordFreqMap;
    }
}