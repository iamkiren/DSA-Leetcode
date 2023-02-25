class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            int idx = index[i];
            
            if(idx < i)
            {
                for(int j = i; j > idx; j--)
                    res[j] = res[j-1];
            } 
            
            res[idx] = nums[i];
        }
        
        return res;
    }
}