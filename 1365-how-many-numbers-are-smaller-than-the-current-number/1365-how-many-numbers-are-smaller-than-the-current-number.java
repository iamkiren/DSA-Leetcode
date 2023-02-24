class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] res  = new int[length];

        for(int i = 0; i < length ; i++){
            int count = 0;
            for(int j = 0; j < length; j++){
                if( nums[i] > nums [j] ){
                    count++;
                }
            }
            res[i] = count;
        }

        return res;
    }
}