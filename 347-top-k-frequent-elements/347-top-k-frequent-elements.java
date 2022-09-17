class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int arr[] = new int[k];
        for(int i=0; i<k; i++){
            int max= Integer.MIN_VALUE, val=0;
            for(int j : map.keySet()){
                if(max<map.get(j)){
                    max = map.get(j);
                    val = j;
                }
            }
            arr[i]=val;
            map.remove(val);
        }
        return arr;
    }
}
