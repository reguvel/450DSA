//link:https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
class Compute {
    
    public void rotate(int a[], int n)
    {
        for(int i=n-1;i>0;i--){
            int t=a[i-1];
            a[i-1]=a[i];
            a[i]=t;
        }
    }
}
