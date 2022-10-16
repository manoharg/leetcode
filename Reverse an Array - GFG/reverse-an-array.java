import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 //code &&
	 int t,n;
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 t= Integer.parseInt(br.readLine());
	 while(t-->0)
	 {
	     	 n= Integer.parseInt(br.readLine().trim());
	    String[] str= br.readLine().trim().split("\\s+");
	    int[] arr= new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]= Integer.parseInt(str[i]);
	    }
	    reverse(arr, 0, n-1);
	    for(int i=0;i<n;i++)
	    {
	     System.out.print(arr[i]+" ");
	     
	    }
	    System.out.println();
	    
	 }
	 }
	 
	 static void reverse(int[] arr, int s,int e){
	     if(s>e)
	     return;
	     int t=arr[s];
	     arr[s]=arr[e];
	     arr[e]=t;
	     reverse(arr, s+1, e-1);
	 }
}