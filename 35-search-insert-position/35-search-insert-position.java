class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target)
                start = start + 1;
            else
                end = end - 1;
            
        }
        return end + 1;
    }
}