class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String number = Integer.toString(x);

        int low = 0;
        int high = number.length() - 1;

        while(low < high){
            if(number.charAt(low) != number.charAt(high)){
                return false;
            }else{
                low++;
                high--;
            }
        }
        return true;
    }
}