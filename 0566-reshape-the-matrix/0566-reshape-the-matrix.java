class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }else{
            int[] all = new  int[m*n];
            int[][] reshapedMatrix = new int[r][c];
            int k = 0;
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                   all[k] =  mat[i][j];
                   k++;
                }
            }
            k = 0;
            for(int i = 0 ; i < r ; i++){
                for(int j = 0 ; j < c ; j++){
                   reshapedMatrix[i][j] = all[k];
                   k++;
                }
            }
            return reshapedMatrix;
        }
    }
}