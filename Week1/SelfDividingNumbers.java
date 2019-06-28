class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<Integer>();
        
        for(int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                selfDividingNumbers.add(num);
            }
        }
        return selfDividingNumbers;
    }
    
    private boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0 ) {
                return false;
            }
            temp /= 10; 
        }
        return true;
    }
}