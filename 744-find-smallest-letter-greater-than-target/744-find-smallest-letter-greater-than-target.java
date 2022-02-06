class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start=0;
        int end = letters.length-1;
        while(start<=end)
	{
		int mid = start+(end-start)/2;
		
		if (target<letters[mid])
		{
			end = mid-1;
            
		}
		
		else 
		{
			start = mid+1;
		}
	}
	return letters[start%letters.length]; // we have taken modulus here because if the value of start == letters.length then we don't have any letter greter than letters[letters.length] so we will submit the answer from the starting

    }
}