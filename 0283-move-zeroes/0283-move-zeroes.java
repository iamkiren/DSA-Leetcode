class Solution {
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int zeroIndex = 0;
        for (int i = 0; i < length; i++) {


            if (nums[i] != 0) {
                swap(nums, zeroIndex, i);
                zeroIndex++;
            }
        }
    }

    public static void   swap(int[] nums, int zeroIndex, int i) {
        int temp = nums[zeroIndex];
        nums[zeroIndex] = nums[i];
        nums[i] = temp;
    }
}