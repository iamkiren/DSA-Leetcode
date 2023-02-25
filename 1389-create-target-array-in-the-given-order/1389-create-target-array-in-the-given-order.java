class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       int len = nums.length;

        int[] result = new int[len];
        Arrays.fill(result, -1);

        for (int i = 0; i < len; i++) {
            if (result[index[i]] == -1) {
                result[index[i]] = nums[i];
            } else {
                int currentIndex = index[i];
                int currentValue = nums[i];
                int temp;

                while (currentIndex <= i) {
                    temp = result[currentIndex];
                    result[currentIndex] = currentValue;
                    currentValue = temp;
                    currentIndex++;
                }
            }
        }
        return result; 
    }
}