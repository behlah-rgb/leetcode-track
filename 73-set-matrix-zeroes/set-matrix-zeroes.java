class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] markedRows = new boolean[rows];
        boolean[] markedCols = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    markedRows[i] = true;
                    markedCols[j] = true;
                }
            }
        }
        // // If very few rows/columns are marked, Option 1 does much less work
        // for (int i = 0; i < rows; i++){
        //     if (markedRows[i]) {
        //         for (int k = 0; k < cols; k++) matrix[i][k] = 0;
        //     }
        // }
        // for (int i = 0; i < cols; i++){
        //     if (markedCols[i]) {
        //         for (int k = 0; k < rows; k++) matrix[k][i] = 0;
        //     }
        // }

        // // Cache-friendly access + Each cell is visited exactly once.
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         if (markedRows[i] || markedCols[j]) matrix[i][j] = 0;
        //     }
        // }

        // keeps all memory access row-wise and skips already-zeroed rows.
        for (int i = 0; i < rows; i++) {
            if (markedRows[i]) {
                Arrays.fill(matrix[i], 0);
            } else {
                for (int j = 0; j < cols; j++) {
                    if (markedCols[j]) matrix[i][j] = 0;
                }
            }
        }
    }
}