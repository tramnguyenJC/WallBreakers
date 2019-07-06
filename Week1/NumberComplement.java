class Solution {
    public int findComplement(int num) {
        String binaryStr = numToBinaryString(num);

        String complementBinary = "";
        for (int i = 0; i < binaryStr.length(); i++) {
        	if(binaryStr.charAt(i) == '0')
        		complementBinary += "1";
        	else
        		complementBinary += "0";
        }
        return binaryToNum(complementBinary);
    }

    private int binaryToNum(String s) {
    	int num = 0;
    	int exp = 0;
    	for (int i = s.length() - 1; i >= 0; i--) {
    		num += Integer.parseInt(s.charAt(i) + "")*Math.pow(2, exp);
    		exp++;
    	}
    	return num;
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
