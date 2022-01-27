
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = 0;
        switch(ruleKey){
            case "color": ruleIndex = 1;
                break;
            case "name": ruleIndex = 2;
                break;
            default: 
                break;
        }
        int count =0;
        for(List<String> item: items){
           if(item.get(ruleIndex).equals(ruleValue)){
               count++;
           }
        }
        return count;
        
    }

}