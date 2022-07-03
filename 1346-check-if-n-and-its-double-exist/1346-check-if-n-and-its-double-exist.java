// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         for(int i  = 0 ; i<arr.length;i++)
//         {
//             for (int j = 0; j< arr.length; j++)
//             {
//                 if(arr[i] == arr[j]*2 && i != j)
//                     return true;
                    
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr) {
            if(set.contains(a*2) || (a%2 == 0 && set.contains(a/2))) 
                return true;
            set.add(a);
        }
        return false;
    }
}