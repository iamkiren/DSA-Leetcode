class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[123];

        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i)]++;
        }

        int count = 0;

        for (int  i = 97; i < 123; i++) {
            if (arr[i] >= 1) {
                count++;
            }
        }

        return count == 26;
    }
}