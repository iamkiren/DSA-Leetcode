class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);
        int[] result  = new int[nums.length];

        for (int i = 0 ; i < nums.length; i++) {
            result[i] = Arrays.binarySearch(sortedArray, nums[i]);

            while (result[i] > 0 && sortedArray[result[i]] == sortedArray[result[i] - 1]) {
                result[i]--;
            }
        }

        return result;
    }
}