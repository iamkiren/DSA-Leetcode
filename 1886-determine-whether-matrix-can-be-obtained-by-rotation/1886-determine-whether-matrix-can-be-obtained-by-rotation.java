class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int l = mat.length;
        int[][] arr = mat;
        int i = 1;

        while (i <= 4) {
            arr = rotate(arr, l);
            if (Arrays.deepEquals(target, arr) == true) {
                return true;
            }

            i++;
        }

        return false;
    }

    public int[][] rotate(int[][] mat, int l) {
        int[][] arr = new int [l][l];


        for (int i = 0 ; i < l ; i++) {
            for (int j = 0 ; j < l ; j++) {
                arr[j][l - 1 - i] = mat[i][j];
            }
        }

        return arr;
    }
}