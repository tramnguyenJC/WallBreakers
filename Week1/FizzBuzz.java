class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzStrings = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                fizzBuzzStrings.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzBuzzStrings.add("Fizz");
            } else if (i % 5 == 0) {
                fizzBuzzStrings.add("Buzz");
            } else {
                fizzBuzzStrings.add("" + i);
            }
        }
        return fizzBuzzStrings;
    }
}