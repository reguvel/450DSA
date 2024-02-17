//link:https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        
        Arrays.sort(a);
        return new Pair(a[0],a[a.length-1]);
        //Write your code here
    }
}
