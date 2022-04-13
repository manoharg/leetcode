class Solution {
    public int[][] generateMatrix(int n) {
     
      int[][] ans = new int[n][n];  
      
        int r=n;
        int c= n;
        int lc=0;
        int rc= c-1;
        int tr= 0;
        int br= r-1;
        int dir=0;
        int count=1;
        while(count<=r*c)
        {
            
               if(dir==0)
                {
                    for(int i=lc;i<=rc;i++)
                    {
                        //ans.add(matrix[tr][i]);
                        ans[tr][i]= count;
                        count++;
                    }
                   dir=1;
                   tr++;
                }else if(dir==1)
               {
                   for(int i=tr;i<=br;i++)
                   {
                   //    ans.add(matrix[i][rc]);
                          ans[i][rc]= count;
                        count++;
                       
                   }
                   rc--;
                   dir=2;
                   
               }else if(dir==2)
               {
                   for(int i=rc;i>=lc;i--)
                   {
                    //   ans.add(matrix[br][i]);
                          ans[br][i]= count;
                        count++;
                   }
                   br--;
                   dir=3;
               }else if(dir==3)
               {
                   for(int i=br;i>=tr;i--)
                   {
                      // ans.add(matrix[i][lc]);
                          ans[i][lc]= count;
                        count++;
                   }
                   lc++;
                   dir=0;
               }
            
        }
        return ans;
    }
    
}