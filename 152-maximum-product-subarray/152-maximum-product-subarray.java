class Solution {
    public int maxProduct(int[] nums) {
        int max_overall=nums[0];
        int max_end=nums[0];
        int min_end=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=max_end;
            max_end=Math.max(nums[i],Math.max(max_end*nums[i],min_end*nums[i]));
            min_end=Math.min(nums[i],Math.min(temp*nums[i],min_end*nums[i]));
            max_overall=Math.max(max_overall,max_end);
        }
        return max_overall;
    }
}