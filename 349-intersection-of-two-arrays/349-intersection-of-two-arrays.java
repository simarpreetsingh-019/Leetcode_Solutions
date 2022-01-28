class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Using the advantage of length of Array ie 1000
        int[] freq=new int[1001];
        for(int x:nums1){
            freq[x]++;
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int x: nums2){
            if(freq[x] >0){
                list.add(x);
                freq[x]=0;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }   
}
