class Solution {
    public int reverse(int num) {
        if(num>=Integer.MAX_VALUE || num<=Integer.MIN_VALUE) return 0;
        int rev = 0;
        int len = (int)Math.log10(Math.abs(num));
        for(; len>=0; len--){
            rev += num%10 * (Math.pow(10, len));
            num /= 10;
        }
        if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE) return 0;
        else return rev;
    }
}