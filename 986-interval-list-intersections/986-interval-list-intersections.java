class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int fl = firstList.length;
        int sl = secondList.length;
        ArrayList<int[]> ret = new ArrayList<>();
        if(firstList.length==0)
            return new int[0][0];
        if(sl==0)
            return new int[0][0];
        
        int i=0,j=0;
        while(i<fl&&j<sl){
            // overlapping part
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            // valid overlap
            if (start <= end) {
                ret.add(new int[] { start, end });
            }
                  // ignore the interval which is finishing early
            if (firstList[i][1] == end) i++; else j++;
        }
        return ret.toArray(new int[1][2]);
    }
}