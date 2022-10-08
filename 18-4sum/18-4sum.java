class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();// to contain unique triplets
        Arrays.sort(nums);
        for(int k=0;k<n-3;k++){
            for(int i=k+1;i<n-2;i++){
                int low=i+1;int high = n-1;
                while(low < high){
                    long sum = (long)(nums[k] + nums[i]) + (long)(nums[low] + nums[high]) ;
                    if(sum==target) result.add(Arrays.asList(nums[k],nums[i], nums[low++], nums[high--]));
                    else if(sum < target)low++;
                    else high--;
                }
            }
        }
        return new ArrayList<>(result);
    }   
}