class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int [n];
        int j = 0;

        for(int i = 1 ;i <= n/2 ; i++){
            arr[j] = i;
            arr[j + 1] = -i;
            j+=2;
        }

        return arr;
    }
}
/*

here idea is if the lenght  is  odd there is  o and pair of + and -ve numbers
and if it is even then there are pairs of + and -

eg:5
[1, -1 , 2 , -2 , 0] and here we dont have to fill the last number zero 
which is alredy zero by default while declaring an array.

eg:4
[1, -1 , 2 , -2]

*/