class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length -1;
        
        while(lo <= hi)
        {
            int mid = (lo + hi)/2;
            
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[lo]<= nums[mid])
            {
                if(target >= nums[lo] && nums[mid] > target)
                {
                    hi = mid -1;
                }
                else{
                    lo = mid+1;
                }
            }
            else if(nums[mid] <= nums[hi])
            {
                if(target > nums[mid] && nums[hi] >= target)
                {
                    lo = mid+1;
                }
                else{
                    hi = mid -1;
                }
            }
        }
        return -1;
    }
}

















