class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Method 1 : Sorting array
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
    
//         Method 2
//        
//         HashSet<Integer> distinct = new HashSet<>();
        
//         for(int i = 0; i< nums.length; i++)
//         {
//             if(distinct.contains(nums[i]))
//                 return true;
//             distinct.add(nums[i]);
//         }
//         return false;        
//     }
}