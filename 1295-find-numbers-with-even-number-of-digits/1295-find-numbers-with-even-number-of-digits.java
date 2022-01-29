class Solution {
    public int nod(int n)
    {
        int count = 0;
        while(n >0)
        {
            count+=1;
            n = n/10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums)
        {
            int n = nod(i);
            if(n%2 == 0)
                count+=1;
        }
        return count;
    }
}