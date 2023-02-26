class Solution {
    public int missingNumber(int[] nums) {
        int[] frequencyArray = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            frequencyArray[nums[i]] = -1;
        }
        int j;
        for (j = 0; j < nums.length; j++) {
            if (frequencyArray[j] != -1) {
                return j;
            }
        }

        return j;
    }
}