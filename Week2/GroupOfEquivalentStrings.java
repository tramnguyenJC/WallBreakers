class Solution {
    public int numSpecialEquivGroups(String[] A) {
        // I think Leetcode test cases are wrong. For instance, their 
        // expected answer is 2 when it should be 1 for
        // ["abcd","cdab","adcb","cbad"] , and 1 when it
        // should be 4 for ["aa","bb","ab","ba"].
        HashSet<ArrayList<SortedSet>> group = new HashSet<>();
        for(String str : A) {
            SortedSet<Character> oddChars = new TreeSet<>();
            SortedSet<Character> evenChars = new TreeSet<>();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    evenChars.add(str.charAt(i));   
                } else {
                    oddChars.add(str.charAt(i));
                }
            }
            ArrayList<SortedSet> pair = new ArrayList<>();
            pair.add(oddChars);
            pair.add(evenChars);
            group.add(pair);
        }
        return group.size();
    }
}