class Solution {
    public int[] sumZero(int n) {
      int[] ans= new int[n];
        for(int i=0,a=1;i<n/2;i++,a++){
            ans[i]=a;
            ans[n-1-i]=-a;
        }return ans;
    }
} 
