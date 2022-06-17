class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int diff = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int a : aliceSizes){
            diff += a;
            set.add(a);
        }
        for (int b : bobSizes){
            diff -= b;
        }
        diff /= 2;
        for (int b : bobSizes){
            if(set.remove(b + diff)) 
                return new int[] {b + diff, b};
        }
        return new int[0];
    }
}