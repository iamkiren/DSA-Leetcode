class Solution {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            res[i] = nums[index];
        }

        return res;
    }
}