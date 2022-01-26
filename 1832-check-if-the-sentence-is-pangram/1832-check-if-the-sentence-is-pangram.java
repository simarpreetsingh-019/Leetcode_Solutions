class Solution {
 public boolean checkIfPangram(String sentence) {
    int[] charArr = new int[26];
    /**Iterate the sentence on character basis and store the count of occurence in array.
    index is calculated as the difference between the ASCII value of current character and 'a' which will           be in between 0-25.
    */
    for(int i = 0 ; i < sentence.length() ; i++)
        charArr[sentence.charAt(i)-'a']++;
    
    /**
    Iterate the array again and check for any index where the frequency is 0. If any index has frequency 0          return false as it is not a pangram
    */
    for(int i = 0 ; i < charArr.length ; i++)
        if(charArr[i]==0)
            return false;
    
    return true;
}
}
