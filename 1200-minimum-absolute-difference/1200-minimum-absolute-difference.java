class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
     Arrays.sort(arr);
     int min=Integer.MAX_VALUE;
     for(int i=1;i<arr.length;i++)
     {
         min=Math.min(min,arr[i]-arr[i-1]);
     }
     int i=0;
     List<List<Integer>> res=new ArrayList<>();
     for(int j=1;j<arr.length;j++)
     {
      while(i!=j&&arr[j]-arr[i]>min)
      {
          i++;
      }
      if(arr[j]-arr[i]==min)
          {
            ArrayList<Integer> al=new ArrayList<>();
            al.add(arr[i]);
            al.add(arr[j]);
            res.add(al);
          }      
      }
     return res;
    }
}
// class Solution {
//     public List<List<Integer>> minimumAbsDifference(int[] arr) {
//         List<List<Integer>> ans = new ArrayList();
//         Arrays.sort(arr);
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length - 1; i++) {
//             int diff = arr[i + 1] - arr[i];
//             if (diff < min) {
//                 min = diff;
//                 ans.clear();  // ans = new ArrayList<>();
//                 ans.add(Arrays.asList(arr[i], arr[i + 1]));
//             } else if (diff == min) {
//                 ans.add(Arrays.asList(arr[i], arr[i + 1]));
//             }
//         }
//         return ans;
//     }
// }