class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int maxi = -(int)1e9;
        for(int i = 0; i< candies.length; i++)
        {
            maxi = Math.max(maxi,candies[i]);
        }
        
        int n=0;
        for(int i = 0; i < candies.length; i++)
        {
            n = candies[i] + extraCandies;
            if(n < maxi){
                ans.add(false);
            }
            else{
                ans.add(true);
          }
    }
        return ans;
    }
}