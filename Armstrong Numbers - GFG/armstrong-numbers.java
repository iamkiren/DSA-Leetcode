//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int sum = 0;
        int numCopy = n;
        
        while(numCopy > 0){
            int remainder = numCopy%10;
            
            sum +=  Math.pow(remainder,3);
            
            numCopy/=10;
        }
        
        if(sum == n){
           return "Yes"; 
        }else{
            return "No";
        }
    }
}