class Solution {
    public void rotate(int[][] matrix) {
        int l = matrix.length;

//first make the transpose of the mtrix
        for(int i = 0 ; i < l ; i++){
            for(int j = i +1 ; j < l ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < l ; i++){
            for(int j = 0 ; j < l/2 ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][l-1-j];
                matrix[i][l-1-j] = temp;
            }
        }
    }
}