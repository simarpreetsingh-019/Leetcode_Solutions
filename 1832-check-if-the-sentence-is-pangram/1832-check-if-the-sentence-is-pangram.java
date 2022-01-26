class Solution {
 public boolean checkIfPangram(String sentence) {
boolean flag=false;
HashSet hs=new HashSet<>();
for(int i=0;i<sentence.length();i++){
hs.add(sentence.charAt(i));
}
if(hs.size()==26){
flag=true;
}
else{
flag=false;
}
return flag;
}
}
