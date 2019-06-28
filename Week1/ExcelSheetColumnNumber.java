class ExcelSheetColumnNumber {
    private static final int ALPHABET_SIZE = 26;
    public int titleToNumber(String s) {
        int colNumber = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int correspondingColOfChar = ((int)(c) - (int)'A' + 1);
            colNumber += correspondingColOfChar * Math.pow(ALPHABET_SIZE, s.length() - i - 1);
        }
        return colNumber;
    }
}