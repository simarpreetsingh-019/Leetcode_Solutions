class Solution {
    public int[] sumZero(int n) {
   int[] ans= new int[n];

    //putting values in array
     for(int i=0 ; i<n/2 ; i++ )
     {
         ans[i]=-(i+1);
         ans[i+(n/2)]=i+1;
        
     }
    //if number is odd , add zero in the end
     if( n%2==1 )
         {
             ans[n-1] = 0;
         }
    return ans;
}
} 
