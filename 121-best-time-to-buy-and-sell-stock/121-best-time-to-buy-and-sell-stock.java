// Que link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// Method 1:
// class Solution {
//     public int maxProfit(int[] prices) {
//         int maxCur = 0, maxSoFar = 0;
//         for(int i = 1; i < prices.length; i++) {
//             maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
//             maxSoFar = Math.max(maxCur, maxSoFar);
//         }
//         return maxSoFar;
//     }
// }


// Method 2:
class Solution {
    // public int maxProfit(int[] prices) {
    //     int ans=0;
    //     if(prices.length==0){
    //         return ans;
    //     }
    //     int bought=prices[0];                                
    //     for(int i=1;i<prices.length;i++){
    //         if(prices[i]>bought){
    //             if(ans<(prices[i]-bought)){
    //                 ans=prices[i]-bought;
    //             }
    //         }
    //         else{
    //             bought=prices[i];
    //         }
    //     }
    //     return ans;
    // }
    public int maxProfit(int[] prices) {
        int res = 0;
        
        int lowest = prices[0];
        
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] < lowest) {
                lowest = prices[j];
            } else {
                res = Math.max(res, prices[j] - lowest);
            }
        }
        
        return res;
    }
}