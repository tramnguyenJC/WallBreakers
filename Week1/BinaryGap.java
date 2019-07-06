class Solution {
    public int binaryGap(int N) {
     	String binaryStr = numToBinaryString(N);
     	int maxGap = 0, gap = 1;
     	for (int i = 1; i < binaryStr.length(); i++) {
     		if (binaryStr.charAt(i) == '0') {
     			gap++;
     		} else {
     			if (gap > maxGap) {
     				maxGap = gap;
     			}
     			gap = 1;
     		}
     	}
     	return maxGap;
    }

    private String numToBinaryString(int N) {
    	String str = "";
    	while(N > 0) {
    		str = (N % 2 + "") + str;
    		N /= 2;
    	}
    	return str;
    }
}
