class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> repeats = new HashSet<>();
        while (true) {
            n = calcSumOfSquaresOfDigits(n);
            if (n == 1) return true;
            if (repeats.contains(n)) return false;
            repeats.add(n);
        }
    }
    
    private int calcSumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n >= 1) {
            sum += (n%10)*(n%10);
            n /= 10;
        }
        return sum;
    }
}