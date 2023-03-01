class Solution {
    public int largestAltitude(int[] gain) {
        int[] result = new int [gain.length + 1];
        result[0] = 0;
        for(int i = 0 ; i < gain.length; i ++ ){
            result[i + 1] = result[i] + gain[i];
        }
        
        int max = 0;
        for(int i = 0; i <= gain.length ; i++){
            max = Math.max(max,result[i]);
        }
      return max;  
    }
}

/*
input array = [-5,1,5,0,-7]
altitudes array = [0,-5,-4,1,1,-6] 

1st element =  0 + -5
2nd element = -5 + 1
3rd element = -4 + 5 and so on 

so we initialize result array with 0 and
next element will be  i+1 th element = i th element of altitude array + i th element of result array

and we find the max element of result array
 */