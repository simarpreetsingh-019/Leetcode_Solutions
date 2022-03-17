class Solution {
public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count = 1;
    int result = 0;
    for(int i=0; i<flowerbed.length; i++) {
        if(flowerbed[i] == 0) {
            count++;
        }else {
            result += (count-1)/2; // 1 will be added in result only if count=3, means 3 continuous 0. 2 will be added for count=5, 3 for count=7 and so on.
            count = 0;
        }
    }
    if(count != 0) result += count/2;
    return result>=n;
}}