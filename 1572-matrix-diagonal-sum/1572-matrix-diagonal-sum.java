class Solution {
    public int diagonalSum(int[][] mat) {
        int l = mat.length;
        int sum  = 0 ;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i] + mat[i][l - 1 - i];
        }

        return l % 2 == 1 ? sum - mat[l / 2][l / 2] : sum;
    }
}

/*
    - the first diagonal sum where the i and j are same
    - second diagonal where the column starts from length-1-i to 0
    - then if the length is odd we have to remove the middle element
      because it was added twice and then return the sum
    - if it is even then return the sum
*/