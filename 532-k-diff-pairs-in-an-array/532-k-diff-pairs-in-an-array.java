class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> found = new HashSet<>();
        for (int n : nums) {
            if (numbers.contains(n + k)) found.add(n);
            if (numbers.contains(n - k)) found.add(n - k);
            numbers.add(n);
        }
        return found.size();
    }
}
