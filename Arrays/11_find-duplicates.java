
//link:https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> dup=new ArrayList<>();
        // int res[]=new int[n];
        // Arrays.fill(res,0);
        // for(int i=0;i<n;i++){
        //     res[arr[i]]+=1;
        // }
        // for(int i=0;i<n;i++){
        //     if(res[i]>1){
        //         dup.add(i);
        //     }
        // }
        
        for(int i=0;i<n;i++){
            int index=arr[i]%n;
            arr[index]+=n;
        }
        for(int i=0;i<n;i++){
            if(arr[i]/n>=2){
                dup.add(i);
            }
        }
        if(dup.size()==0){
            dup.add(-1);
        }
        return dup;
        
    }
}
