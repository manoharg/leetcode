//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergeSort(arr, 0, N-1, N);
    }
    static long mergeSort(long arr[], long l, long r, long n){
        if(l<r){
            int m = (int) (l+ (r-l)/2);
            long left = mergeSort(arr, l, m,n);
            long right = mergeSort(arr, m+1, r,n);
            return left+right+merge(arr, l, m, r,n);
        }
        return 0;
    }
    static long merge(long arr[], long l, long m, long r, long n){
        long ret =0;
        int i=(int)l, j=(int)m+1;
        long[] temp = new long[(int)(r-l+1)];
        int k=0;
        while(i<=m && j<=r){
            if(arr[i]>arr[j]){
                ret += (int)(m-i+1);
                temp[k++] = arr[j++];
            }else{
                temp[k++] = arr[i++];
            }
        }
        while(i<=m){
            temp[k++] = arr[i++];
        }
        while(j<=r){
            temp[k++] = arr[j++];
        }
        i=(int)(l);
        for(k=0;k<temp.length;k++){
            arr[i++]=temp[k];
        }
        return ret;
    }
}