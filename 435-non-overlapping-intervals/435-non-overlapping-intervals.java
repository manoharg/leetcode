class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int c = 0;

        // System.out.println(Arrays.deepToString(intervals));
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                // cancelled the meeting, hence compare next with previous meeting
               // end = intervals[i - 1][1];
                c++;
            } else end = intervals[i][1];
        }
        return c;
    }
}
