class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> list = new ArrayList<>();
        int[] freq = new int[1001];
        for (int i : nums1) {
            freq[i]++;
        }
        for (int i : nums2) {
            if (freq[i] > 0) {
                list.add(i);
                freq[i] = 0;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }   
}
