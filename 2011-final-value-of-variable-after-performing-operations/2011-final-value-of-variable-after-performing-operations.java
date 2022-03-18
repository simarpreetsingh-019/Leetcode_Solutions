class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String i : operations){
            if(i.equals("++X") || i.equals("X++")) X++; // might give wrong ans with i=="++X", so use '.equals'
            else X--;
        }
        return X;
    }
}
