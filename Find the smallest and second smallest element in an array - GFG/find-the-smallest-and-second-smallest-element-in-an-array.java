//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        if(n < 2){
            long[] end = {-1,-1};
            return end;
        }
        long small = Math.min(a[0],a[1]);
        long secondSmall = Math.max(a[0],a[1]);

        for (int i = 2; i < a.length; i++ ) {
            if (a[i] < small) {
                secondSmall = small;
                small = a [i];
            } else if (a[i] < secondSmall && a[i] != small) {
                secondSmall = a[i];
            }
        }
        if(small == secondSmall ){
            small = -1;
            secondSmall = -1;
        }
        long[] result = {small, secondSmall};
        return result;
    }
}
