class Solution {

    public int findMinArrowShots(int[][] points) {
        /**
        1. Similar to merge intervals
        visualize the shooting board
        if any interval is overlapping, new arrow is not required and end becomes the min. 
        If there is no overlap, new arrow is required.
        */
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int end = points[0][1];
        int arrows = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end) {
                end = Math.min(end, points[i][1]);
            } else {
                end = points[i][1];
                arrows++;
            }
        }

        return arrows;
    }
}
