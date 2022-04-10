class Solution {
    public boolean ispalidrome( String str){
        
        int i=0; int j= str.length()-1;
        
        while( i <= j){
            if( (str.charAt(i) -'0') != ( str.charAt(j)-'0' ) )
                return false;
             i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        
        for( int i=0; i < words.length ; i++){
            String str = words[i];
            
            if( ispalidrome( str))
                return str;
        }
        return "";
    }
    
    
}