class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        for(int i = l -1 ; i >= 0 ; i-- ){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArray = new int[l+1];
        newArray[0] = 1;
        return newArray;
    }
}