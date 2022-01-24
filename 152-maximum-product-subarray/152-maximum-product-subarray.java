class Solution {
    public int maxProduct(int[] nums) {
        int max_overall = nums[0];
        int min_ending_here = nums[0],
            max_ending_here = nums[0];
        
        for(int i = 1; i<nums.length; ++i)
        {
            int temp = max_ending_here;
            max_ending_here = Math.max(nums[i], Math.max(max_ending_here * nums[i], min_ending_here * nums[i]));
            min_ending_here = Math.min(nums[i], Math.min(temp * nums[i], min_ending_here * nums[i]));
            max_overall = Math.max(max_overall, max_ending_here);
        }
        return max_overall;
    }
}