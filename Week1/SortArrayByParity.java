class sortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int leftIdx = 0, rightIdx = A.length - 1;
        for (int num : A) {
            if(num % 2 == 0) {
                arr[leftIdx] = num;
                leftIdx++;
            } else {
                arr[rightIdx] = num;
                rightIdx--;
            }
        }
        return arr;
    }
}