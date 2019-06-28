class PlusOne {
    public int[] plusOne(int[] digits) {      
        boolean allNines = true;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i] != 9) {
                allNines = false;
                break;
            }
        }
        
        if (allNines) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = 0;
            }
            return arr;
        }
        int[] arr = new int[digits.length];
        int idx = digits.length - 1;
        do {
            arr[idx] = (digits[idx] + 1) % 10;
            idx--;
        } while (idx >= 0 && arr[idx + 1] == 0);
        for (int i = idx; i >= 0; i--) {
            arr[i] = digits[i];
        }
        return arr;
    }
}