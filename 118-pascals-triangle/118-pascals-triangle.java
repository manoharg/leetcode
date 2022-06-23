class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
    
        for(int i=1;i<=numRows;i++){
            List<Integer> temp = new ArrayList<>();
            if(i==1){
                temp.add(1);
                ans.add(temp);
            }else{
             temp.add(1);
            if(!ans.isEmpty()){
             List<Integer> prev = ans.get(ans.size()-1);                 for(int j=0;j<prev.size()-1;j++)
                 temp.add(prev.get(j)+prev.get(j+1));
            }
            temp.add(1);
            ans.add(temp);    
            }
           
        }
        return ans;
    }
}