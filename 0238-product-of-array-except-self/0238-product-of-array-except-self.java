class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] left_Product  = new int[l];
        int[] right_Product = new int[l];
        int[] output_Array  = new int [l];

        left_Product[0] = 1;
        right_Product[l-1] = 1;

        for(int i =1; i < l; i++){
            left_Product[i] = left_Product[i-1] * nums[i-1];  
        }

        for(int i = l-2; i >= 0 ; i--){
            right_Product[i] = right_Product[i+1] * nums[i+1];  
        }

        for(int i = 0 ; i < l ; i++){
            output_Array[i] = left_Product[i] * right_Product[i];
        }

        return output_Array;
    }
}