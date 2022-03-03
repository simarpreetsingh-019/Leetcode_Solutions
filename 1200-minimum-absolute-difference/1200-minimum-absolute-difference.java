class Solution {
    public List<List<Integer>> minimumAbsDifference(final int[] arr) {
        Arrays.sort(arr);
        final List<List<Integer>> result = new LinkedList<>();
        int minDistance = Integer.MAX_VALUE;
        for (int i=1; i<arr.length; i++) {
            minDistance = Math.min(minDistance, arr[i] - arr[i-1]);
        }
        for (int i=1; i<arr.length; i++) {
            if (minDistance == arr[i] - arr[i - 1]) {
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return result;
    }
}
// class Solution {
//     public List<List<Integer>> minimumAbsDifference(int[] arr) {
//         List<List<Integer>> ans = new ArrayList();
//         Arrays.sort(arr);
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length - 1; i++) {
//             int diff = arr[i + 1] - arr[i];
//             if (diff < min) {
//                 min = diff;
//                 ans.clear();  // ans = new ArrayList<>();
//                 ans.add(Arrays.asList(arr[i], arr[i + 1]));
//             } else if (diff == min) {
//                 ans.add(Arrays.asList(arr[i], arr[i + 1]));
//             }
//         }
//         return ans;
//     }
// }