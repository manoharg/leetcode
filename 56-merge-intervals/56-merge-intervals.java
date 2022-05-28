class Solution {

    public int[][] merge(int[][] intervals) {
        //         Arrays.sort(
        //             intervals,
        //             new Comparator<int[]>() {

        //                 public int compare(int[] a, int[] b) {
        //                     return a[0] - b[0];
        //                 }
        //             }
        //         );

        List<int[]> ans = new ArrayList<>();
        if (intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0]- b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] i : intervals) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                ans.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            }
        }
        ans.add(new int[]{ start, end });
        return ans.toArray(new int[1][2]);
    }
}
