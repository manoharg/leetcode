class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        int f =floor(arr,n,x);
        int c = ceil(arr,n,x);
        if(f!=-1) f= arr[f];
        if(c!=-1) c= arr[c];
        return new Pair(f,c);
    }
    int floor(int[] a,int n, int x){
        int l=0,r=n-1,m;
        int ans =1;
        while(l<=r){
            m=l+(r-l)/2;
            if(a[m]<=x){
                ans=m;
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return ans;
    }
    int ceil(int[] a,int n, int x){
        int l=0,r=n-1,m;
        int ans =1;
        while(l<=r){
            m=l+(r-l)/2;
            if(a[m]>=x){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}
