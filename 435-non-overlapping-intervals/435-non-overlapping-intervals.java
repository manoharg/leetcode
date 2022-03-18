class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1],b[1]));
        int c=0;
        
       // System.out.println(Arrays.deepToString(intervals));
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<intervals[i-1][1]){
                // cancelled the meeting, hence compare next with previous meeting
                intervals[i][0]= intervals[i-1][0];
                intervals[i][1]= intervals[i-1][1];
                
                c++;
            }
                
        }
        return c;
    }
}