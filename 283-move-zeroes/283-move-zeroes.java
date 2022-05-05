class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==0||n==1)
            return;
        
        int nonzero = 0, zero = 0;
        int temp;
        while(zero < n)
            if(nums[zero] == 0)
                zero++;
            
            else
            {
                temp = nums[zero];
                nums[zero] = nums[nonzero];
                nums[nonzero] = temp;
                zero++;
                nonzero++;
            }
            
        
    }
}