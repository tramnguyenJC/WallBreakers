class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int[][] transposedMatrix = new int[A[0].length][A.length];
        for (int col = 0; col < A[0].length; col++) {
            for(int row = 0; row < A.length; row++) {
                transposedMatrix[col][row] = A[row][col];
            }
        }
        return transposedMatrix;
    }
}