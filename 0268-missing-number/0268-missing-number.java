class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int i;
        for ( i = 0; i < length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return i;
    }
}