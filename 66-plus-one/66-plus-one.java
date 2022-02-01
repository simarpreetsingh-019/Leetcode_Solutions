class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i>= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] new_ans = new int[digits.length+1];
        new_ans[0] = 1;
        return new_ans;
    }
}