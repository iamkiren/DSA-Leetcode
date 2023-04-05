class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List <Integer> indexes = new ArrayList<Integer>();

        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < col; j++) {
                if (matrix[i][j] == 0) {
                    indexes.add(i);
                    indexes.add(j);
                }
            }
        }

        for (int i = 0 ; i < indexes.size() ; i += 2) {
            change(matrix, indexes.get(i), indexes.get(i + 1), row, col);
        }
    }

    public void change(int[][] matrix , int r , int c, int row, int col) {
        for (int i = 0; i < row; i++) {
            matrix[i][c] = 0;
        }

        for (int i = 0; i < col; i++) {
            matrix[r][i] = 0;
        }
    }
}