class Solution {
    public static List<Integer> luckyNumbers(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < rows; i++) {
        int min = Integer.MAX_VALUE;
        int colIndex = -1;
        boolean isLucky = true;
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] < min) {
                min = matrix[i][j];
                colIndex = j;
            }
        }
        for (int k = 0; k < rows; k++) {
            if (matrix[k][colIndex] > min) {
                isLucky = false;
                break;
            }
        }
        if (isLucky) {
            result.add(min);
            break;
        }
    }
    return result;
}

}