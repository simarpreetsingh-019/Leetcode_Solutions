class Solution {    
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else if (digits[i] == 9 && i == 0) {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            } else if (digits[i] == 9) {
                if (digits[i - 1] != 9) {
                    digits[i] = 0;
                    digits[i - 1] += 1;
                    return digits;
                } else if (digits[i - 1] == 9) {
                    digits[i] = 0;
                }
            }
        }
        return digits;
    }
}