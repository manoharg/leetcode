// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
    long[] res = new long[N-K+1];
    Queue<Long> queue = new LinkedList<>();
    int start=0;
    int end=0;
    int i=0;
    while(end<N){
        if(A[end]<0){
            queue.offer(A[end]);
        }
        if(end-start+1<K){
            end++;
        }else if(end-start+1==K){
            //res[i++]=queue.peek();
            if(queue.isEmpty()){
               res[i++]=0; 
            }else {
                res[i++]= queue.peek();
                if(queue.peek()==A[start]){
                   queue.poll();
                }
            }
            start++;
            end++;
        }
    }
    return res;
    }
}