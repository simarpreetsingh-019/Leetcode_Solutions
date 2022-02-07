class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        int temp = x, res = 0, rem;
        while(temp > 0){
            rem = temp%10;
            res = res*10+ rem;
            temp/=10;
        }
        
        if(res == x){
            flag = true;
        }
        
        return flag;
    }
}