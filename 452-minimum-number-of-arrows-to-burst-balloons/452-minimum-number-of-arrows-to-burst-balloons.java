class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length <= 1) return points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0])); // sort points in accending order with respect to the first digit
        // before: [[10,16],[2,8],[1,6],[7,12]]
        // after: [[1,6],[2,8],[7,12],[10,16]]


        int shots = 0, lastEnd = Integer.MIN_VALUE;
        for (int[] point : points) {
            if (point[0] > lastEnd) {
                shots++;
                lastEnd = point[1];
            } else {
                lastEnd = Math.min(lastEnd, point[1]);
            }
        }
        return shots;
    }
}
