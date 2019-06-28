class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean capitalFlag = word.ToUpperCase().equals(word);
        boolean lowercaseFlag = word.ToLowerCase().equals(word);
        boolean firstLetterFlag = Character.toUpperCase(word.charAt(0)) ==
        	word.charAt(0) && word.substring(1).toLowerCase().equals(word.substing(1));
        return capitalFlag || lowercaseFlag || firstLetterFlag;
    }
}