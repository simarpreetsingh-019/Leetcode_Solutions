class Solution {
        public int maxSubArray(int[] nums) {
        
       int result = Integer.MIN_VALUE;
        int current = 0;
        
        for(int i = 0;i < nums.length;i++)
        {
            current = Math.max(current+nums[i],nums[i]);
            result = Math.max(result,current);
        }
        
        return result;
    }
}