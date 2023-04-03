class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIndexPosition = nums.length - 1;

        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (i + nums[i] >= lastGoodIndexPosition) {
                lastGoodIndexPosition = i;
            }
        }

        return lastGoodIndexPosition == 0;
    }
}
/*
Here the idea is going from backwards to the starting position
We check from  each position weather can we go to lastGoodPosition (initially which is last position)
and so on
Finally we check weather we reached the initial position
Explanation in the video linked to notes
*/