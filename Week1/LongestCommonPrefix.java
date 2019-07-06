class Solution {
    public String longestCommonPrefix(String[] strs) {
        int idx = 0;
	    while(true) {
	    	if (idx >= strs[0].length()) break;
	    	char c = strs[0].charAt(idx);
	    	for (int i = 1; i < strs.length; i++) {
	    		if(idx >= strs[i].length()  || strs[i].charAt(idx) != c) {
	    			return strs[0].substring(0, idx);
	    		}
        	}
        	idx++;
	    }
	    return strs[0];
    }
}