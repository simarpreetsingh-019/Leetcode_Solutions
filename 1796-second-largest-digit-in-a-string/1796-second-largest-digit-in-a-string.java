class Solution {
    public int secondHighest(String s) 
    {
        int largest = -1;
        int second = largest;
        for(char c:s.toCharArray())
        {
            int i = Character.getNumericValue(c);
            if(i>=0 && i<=9)
            {
                if(i>largest)
                {
                    second = largest;
                    largest = i;
                }
                else if(i<largest && i>second)
                    second = i;
            }
        }
        return second;
    }
}