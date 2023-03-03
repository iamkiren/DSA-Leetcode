class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        
        int[] output_Array  = new int [l];
       
        output_Array[0] = 1;

        for(int i =1; i < l; i++){
            output_Array[i] = output_Array[i-1] * nums[i-1]; 
        }

    int rightProduct = 1;
        for(int i = l-1; i >= 0 ; i--){
            output_Array[i] = output_Array[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return output_Array;
    }
}
/*
This is an optimised solution here => In the output array we are storing all left products first
then in next step we use a variable to store all the right products and then multiplied into the current element in the output array see the video in the notes for better explanation
*/