class Solution {
    // Fixed sliding window
    // T: O(n)
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        long sum=0;
        int i=0,j=0,ans=0;
        int l=arr.length;
        while(j<l){
            sum=sum+arr[j];
            int ws=j-i+1;
            if(ws<k)
                j++;
            else if(ws==k){
                int avg= (int)(sum/k);
                if(avg>=threshold)
                    ans++;
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}