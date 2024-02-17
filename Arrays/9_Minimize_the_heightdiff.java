//link:https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1
class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int min=arr[0];
        int max=arr[n-1];
        int ans=max-min;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }
            int tempmin=Math.min(arr[0]+k,arr[i]-k);
            int tempmax=Math.max(arr[i-1]+k,arr[n-1]-k);
            ans=Math.min(ans,tempmax-tempmin);
        }
        return ans;
    }
}
