class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            result[i] = sum;
        }
        return result;
    }
}