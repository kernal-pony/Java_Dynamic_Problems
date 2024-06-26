
public class MergeSortt
{

    //time complexity is O(log n)
    public static void divide(int arr[],int si, int ei)
    {
        int mid=si+ (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);

    }

    //time complexity is O(n)
    public static void conquer(int arr[],int si, int mid,int ei)
    {
        int merged[]=new int[ei-si+1];// because concept of zero
        int idx1=si , idx2=mid+1,x=0;

        while(idx1<=mid && idx2<=ei)
        {
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            
            else{
            merged[x++]= arr[idx2++];
            }
        }
        while(idx1<=mid)
        {
            merged[x++]=arr[idx1++];
        }

        while(idx2<=ei)
        {
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
    }
    public static void main(String args[])
    {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;

        divide(arr, 0, n);

        //print
        for (int i=0;i<n;i++) {

            System.out.print(arr[i]+ " ");
        }

    }
}