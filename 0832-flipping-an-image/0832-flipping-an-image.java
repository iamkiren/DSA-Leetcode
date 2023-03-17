class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int l = image.length;

        for (int i = 0; i < l; i++) {
            int j = 0;

            while (j < l / 2) {
                int temp = image[i][j];
                image[i][j] = image[i][l - 1 - j];
                image[i][l - 1 - j] = temp;
                j++;
            }
        }

        for (int i = 0 ; i < l ; i++) {
            for (int j = 0 ; j < l; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}