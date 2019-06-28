class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] flippedImage = flipImage(A);
        return invertImage(flippedImage);
    }
    // Separate into two private functions for easier unit testing.
    private int[][] flipImage(int[][] A) {
        int[][] flipped = new int[A.length][A[0].length];
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {
                flipped[row][col] = A[row][A[0].length - col - 1];
            }
        }
        return flipped;
    }
    
    private int[][] invertImage(int[][] A) {
        int[][] inverted = new int[A.length][A[0].length];
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {
                inverted[row][col] = 1 - A[row][col];
            }
        }
        return inverted;
    }
}