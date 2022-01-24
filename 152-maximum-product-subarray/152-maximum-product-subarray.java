class Solution {
    public int maxProduct(int[] nums) {
         int size = nums.length;
        int max = nums[0], min=nums[0], maxSum = nums[0];
        for(int i =1; i<size; i++){
            int currMax = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);
            int currMin = Math.min(Math.min(max*nums[i], min*nums[i]), nums[i]);
            max = currMax;
            min = currMin;
            maxSum = Math.max(currMax, maxSum);
        }
        return maxSum;
    }
}