class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : nums)
            if (x%2 == 0)
                set.add(x);
            else
                set.add(x*2);
        
        int ans = Integer.MAX_VALUE;
        while (true) {
            int val = set.last();
            ans = Math.min(ans, val - set.first());
            if (val%2 == 0) {
                set.remove(val);
                set.add(val/2);
            } else
                break;
        }
        return ans;
    }
}

/*
For each num, if it's odd, double it before adding it to the TreeSet
    Therefore, each number in the set can only be decreased
Within the TreeSet, compute the deviation
    if the largest number is even, make it smaller
Complexity is O(N logM logN); M is the largest number.
*/