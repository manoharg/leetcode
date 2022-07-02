class Solution {
    final int nodes = 100002;
    int[] p = new int[nodes];
    int[] h = new int[nodes];
    boolean union(int a , int b){
        int aP = find(a);
        int bP = find(b);
        if(aP==bP){
            return false;
        }
            
        if(h[aP]<h[bP])
            p[aP] =bP;
        else if(h[aP]>h[bP])
            p[bP]=aP;
        else{
            p[aP]=bP;
            h[bP]++;
            
        }
        return true;
        
    }
    int find(int a){
        if(p[a]==-1)
            return a;
         p[a] = find(p[a]);
        return p[a];    
    }
    
    public int makeConnected(int n, int[][] connections) {
        Arrays.fill(h,1);
        Arrays.fill(p,-1);
        int disc=0;
        for(int[] c: connections){
            if(!union(c[0], c[1]))
                disc++;
        }
        int comp =0;
        
        for(int i=0;i<n;i++){
            if(p[i]==-1){
               // System.out.println("parent "+ i);
                comp++;
            }
                
        }
      
       // System.out.println("comp"+ comp);
        if(disc<comp-1)
            return -1;
        return comp-1;
        
    }
}