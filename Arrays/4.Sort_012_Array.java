//link:https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int l=0,h=n-1,t;
        int mid=0;
        while(mid<=h){
        switch(a[mid]){
            case 1:
                mid++;
                break;
            case 0:
                t=a[mid];
                a[mid]=a[l];
                a[l]=t;
                l++;
                mid++;
                break;
            case 2:
                t=a[mid];
                a[mid]=a[h];
                a[h]=t;
                h--;
                break;
                default:
        }
        }
    }
}
