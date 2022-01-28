class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        int count = 0;
        for(int x : nums1)
        {
            set.add(x);   
        }
        for(int x : nums2)
        {
            if(set.contains(x))
            {
                intersection.add(x);
            }
        }
        int[] ans = new int[intersection.size()];
        int index = 0;
        for(int i : intersection)
        {
            ans[index++] = i;
        }
        return ans; 
    }
}