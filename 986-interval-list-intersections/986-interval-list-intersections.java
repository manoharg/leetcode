class Solution {

    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();
        if (firstList == null || secondList == null) return res.toArray(new int[0][]);
        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {
            // overlapping part
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            // valid overlap
            if (start <= end) {
                res.add(new int[] { start, end });
            }
            // ignore the interval which is finishing early
            if (firstList[i][1] == end) i++; else j++;
        }
        return res.toArray(new int[0][]);
    }
}
