class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        int carry = 1;
    while(index>=0){
            int sum = digits[index] + carry;
            digits[index] = sum % 10;
            carry = sum / 10;
            index--;
        }
        
        if(carry==0){
            return digits;
        } else {
            int[] results = new int[digits.length+1];
            results[0] = carry;
            for(int i=1; i<results.length; i++){
                results[i] = digits[i-1];
            }
            return results;
        }
    }
}