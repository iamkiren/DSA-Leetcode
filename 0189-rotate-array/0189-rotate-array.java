class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if(l == 1) return;
        if(k>=l) k = k%l;
        reverse(nums, 0, l - 1 - k);
        reverse(nums, l - k, l - 1);
        reverse(nums, 0, l - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
