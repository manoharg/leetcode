//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        PriorityQueue<int[]> pq= new PriorityQueue<>((int[] a, int[] b ) -> {
            return a[0]-b[0];
        });
        int r = K;
        int c = K;
        for(int i=0;i<r;i++){
            pq.offer(new int[]{arr[i][0],i,0});
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            ans.add(temp[0]);
           // System.out.println(temp[0]);
            int cr =temp[1];
            int cc =temp[2];
            if(cr<r&&cc+1<c){
                pq.offer(new int[]{arr[cr][cc+1], cr, cc+1});
            }
            
        }
        return ans;
        
    }
}