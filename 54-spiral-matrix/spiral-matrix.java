class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>(m * n);
        int startRow = 0, endRow = m - 1;
        int startCol = 0, endCol = n - 1;

       while (ans.size() < m * n) {
            for (int j = startCol; j <= endCol; j++) ans.add(matrix[startRow][j]);
            startRow++;
            for (int i = startRow; i <= endRow; i++) ans.add(matrix[i][endCol]);
            endCol--;

            if (ans.size() == m * n) break;

            for (int j = endCol; j >= startCol; j--) ans.add(matrix[endRow][j]);
            endRow--;
            for (int i = endRow; i >= startRow; i--) ans.add(matrix[i][startCol]);
            startCol++;
        }

        return ans;
    }
}