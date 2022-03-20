
class Solution {
    // public int subtractProductAndSum(int n) {
    //     int sum=0, product=1;
    //     while(n>0){
    //         sum += n%10;
    //         product *= n%10;
    //         n /= 10;
    //     }
    //     return product-sum;
    // }
     static int cal(int n,int s,int p){
        if(n == 0)
            return p-s;
        s += n%10;
        p *= n%10;
        return cal(n/10,s,p);
    }  
    public int subtractProductAndSum(int n) {
        return cal(n,0,1);
	}
}