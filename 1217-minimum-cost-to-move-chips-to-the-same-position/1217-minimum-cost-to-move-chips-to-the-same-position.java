class Solution {
    public int minCostToMoveChips(int[] position) {
        int l = position.length;
        int odd = 0 , even = 0;
        
        for(int i : position){
            if(i%2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        if(even == l || odd == l) return 0;

        return Math.min(even,odd);
    }
}

/*
Here the idea is for moving from odd to odd or even to even there is no cost
because we are moving 2 positions.
So we take  the total number of even and odd if only even or only odd exists then
there will be no cost.
Otherwise we will return the minimum of two because minimum cost will be for moving
the minimum number to the maximum at  cost of 1 for each coin.
*/