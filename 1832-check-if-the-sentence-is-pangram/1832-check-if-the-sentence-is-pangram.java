class Solution {
    public boolean checkIfPangram(String sentence) {
    char[] temp = new char[sentence.length()];
    temp = sentence.toCharArray();
    int[] freq = new int[26];
    for(int i =0;i<temp.length;i++)
    {
        freq[temp[i] - 'a']++;
    }
    boolean res ;
    for(int i : freq)
    {
        
        if(i == 0)
            return false;
    }
    return true;
  }
}    
    