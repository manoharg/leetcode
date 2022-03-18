class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i=0, l = intervals.length;
        
        // find the right position of new intervals
        // skip the intervals less than start of neew interval
        while(i<l && intervals[i][1]<newInterval[0]){
            res.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
        // Merge the overlapping intervals
        int start = newInterval[0];
        int end = newInterval[1];
        while(i<l&& intervals[i][0]<=end){
            start= Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        res.add(new int[]{start,end});
        while(i<l){
            res.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
          
       return res.toArray(new int[0][]); 
        
    }
}