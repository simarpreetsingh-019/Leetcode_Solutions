// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int[] arr = new int[26];
//         for (int i = 0; i < magazine.length(); i++) {
//             arr[magazine.charAt(i) - 'a']++;
//         }
//         for (int i = 0; i < ransomNote.length(); i++) {
//             if(--arr[ransomNote.charAt(i)-'a'] < 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int[] charArr1 = new int[26];
//         int[] charArr2 = new int[26];

//         for(int i=0;i<ransomNote.length();i++)
//             charArr1[ransomNote.charAt(i)-'a']++;
			
//         for(int i=0;i<magazine.length();i++)
//             charArr2[magazine.charAt(i)-'a']++;
			
//         for(int i=0;i<26;i++)
//             if(charArr1[i]>charArr2[i])
//                 return false;
				
//         return true;
//     }
// }
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>  map = new HashMap();
        
        for(char ch1 : magazine.toCharArray()){
            map.put(ch1,map.getOrDefault(ch1,0)+1);
        }
        int flag=0;
        for(char ch2 : ransomNote.toCharArray()){
            if(map.containsKey(ch2) && map.get(ch2)>0){
                  flag++;
                  map.put(ch2,map.get(ch2)-1);
            }
        }
        return flag==ransomNote.length();
    }
}