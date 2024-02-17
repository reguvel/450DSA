//link:https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        long msf=Integer.MIN_VALUE;
        long meh=0;
        for(int i: arr){
            meh+=i;
            if(msf<meh){
                msf=meh;
            }
            if(meh<0){
                meh=0;
            }
        }
        return msf;
        
        
    }
    
}
