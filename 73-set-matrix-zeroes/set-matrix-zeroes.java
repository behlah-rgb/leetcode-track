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

        for (int i = 0; i < rows; i++){
            if (markedRows[i]) {
                for (int k = 0; k < cols; k++) matrix[i][k] = 0;
            }
        }

        for (int i = 0; i < cols; i++){
            if (markedCols[i]) {
                for (int k = 0; k < rows; k++) matrix[k][i] = 0;
            }
        }   
    }
}