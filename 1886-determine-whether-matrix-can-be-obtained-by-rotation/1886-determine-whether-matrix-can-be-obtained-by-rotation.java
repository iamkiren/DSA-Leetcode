class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int l = mat.length;
        int i = 1;

        if (Arrays.deepEquals(target, mat) == true) {
                return true;
            }

        while (i < 4) {
            mat = rotate(mat, l);
            if (Arrays.deepEquals(target, mat) == true) {
                return true;
            }

            i++;
        }

        return false;
    }

    public int[][] rotate(int[][] mat, int l) {

     //transpose   
        for(int i = 0 ; i < l ; i++){
            for(int j = i + 1 ; j < l ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

//reversing rows
        for (int i = 0 ; i < l ; i++) {
            for (int j = 0 ; j < l/2 ; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][l-1-j];
                mat[i][l-1-j] = temp;
            }
        }

        return mat;
    }
}