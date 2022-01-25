class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int idx;
int val;

    int[] res = new int[nums.length];
    for(int i=0,j=0 ;i<index.length&j<nums.length;i++,j++)
    {
      idx=index[i];  
      val=nums[j];
      InserRes(res,idx,val);
        
    } 
    return res;
    
}

static void InserRes(int[] res, int index ,int value)
{ 
  
  if(res[index]==-1)
    {
        res[index]=value;
    }
    else
    {
        int temp;
        for(int i=index ; i<res.length;i++)
        {
            temp=res[i];
            res[i]=value;
            value=temp;
        }
        
    } 
}
}
//         List<Integer> list = new ArrayList<>();
//         for(int i = 0; i< index.length; i++)
//         {
//             list.add(index[i], nums[i]);
//         }
//         int[] res= new int[index.length];
//         for(int i = 0; i<index.length; i++)
//         {
//             res[i] = list.get(i);
//         }
//         return res;
        
//     }
// }
 