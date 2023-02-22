class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += nums[i];
            result[i] = sum;

        }
        return result;
    }
}