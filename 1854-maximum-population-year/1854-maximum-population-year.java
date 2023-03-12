class Solution {
    public int maximumPopulation(int[][] logs) {
        
    int[] year = new int[101];
    // birth year from 1950 - 2050 so length = 2050 -1950 + 1

    for (int[] log : logs) {
        //here index  =  current year -1950
        year[log[0] - 1950]++; 
        year[log[1] - 1950]--;
    }

    int maxNum = year[0], maxYear = 1950;

    for (int i = 1; i < year.length; i++) {
        year[i] += year[i - 1];  // Generating Prefix Sum
        if (year[i] > maxNum) {
            maxNum = year[i];
            maxYear = i + 1950;
        }
    }
    return maxYear;
    }
}