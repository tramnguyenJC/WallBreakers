class ReverseWordsInString {
    public String reverseWords(String s) {
        String result = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            result += reverseWord(words[i]);
            result += " ";
        }
        result += reverseWord(words[words.length - 1]);
        return result;
    }
    
    private String reverseWord(String s) {
      char[] chars = s.toCharArray();
      for (int i = 0; i < chars.length/2; i++) {
          char temp = chars[i];
          chars[i] = chars[chars.length - i - 1];
          chars[chars.length - i - 1] = temp;
      }
      return String.valueOf(chars);
    }
}