class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        //System.out.println(Arrays.deepToString(intervals));
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(intervals[0][0], intervals[0][1]));
        for(int i=1;i<intervals.length;i++){
            Pair p = stack.peek();
            if(intervals[i][0]>=p.a && intervals[i][0]<=p.b){
                stack.pop();
                stack.push(new Pair(p.a, Math.max(p.b, intervals[i][1])));
            }else{
                stack.push(new Pair(intervals[i][0], intervals[i][1]));
            }
        }
       // System.out.println(stack);
        int[][] ans = new int[stack.size()][2];
        int i=0;
        while(!stack.isEmpty()){
            Pair p = stack.pop();
            ans[i++]= new int[]{p.a, p.b};
        }
        return ans;
    }
    class Pair{
        int a ;
        int b;
        Pair(int a, int b){
            this.a=a;
            this.b=b;
        }
        public String toString(){
            return ""+this.a+" "+ this.b;
        }
    }
}