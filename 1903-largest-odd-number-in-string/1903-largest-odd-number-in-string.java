class Solution {
    public String largestOddNumber(String num) {
        int len = num.length()-1;
        while(len>=0){
            if((num.charAt(len)-'0')%2==1)
                return num.substring(0, len+1);
            len--;
        }
        num="";
        return num;
    }
}