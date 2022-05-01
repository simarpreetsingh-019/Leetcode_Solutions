class Solution {
    List<String> output = new ArrayList<>();
    public List<String> summaryRanges(int[] nums) {
        
        if(nums.length == 0) return output;
        if(nums.length == 1) {
            output.add(""+ nums[0]); 
            return output;
        }
        
        long[] arr = new long[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }
        
        long start = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i - 1] > 1){
                add(start, arr[i - 1]);
                start = arr[i];
            }
            if(i == arr.length - 1){
                add(start, arr[i]);
            }
            
        }
        return output;
    }
    
    private void add(long start, long end){
        StringBuilder sb = new StringBuilder("" + start);
        if(start != end){
            sb.append("->");
            sb.append(end);
        }
        output.add(sb.toString());
    }
}

