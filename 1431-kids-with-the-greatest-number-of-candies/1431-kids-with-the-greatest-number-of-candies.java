class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int maxi = -(int)1e9;
        for(int i = 0; i< candies.length; i++)
        {
            maxi = Math.max(maxi,candies[i]);
        }
        
        for(int i : candies)
        {
            if(i >= maxi - extraCandies)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}