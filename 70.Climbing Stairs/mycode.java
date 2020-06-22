class Solution {
    public int climbStairs(int n) {
        int[] a = new int[n+1];
        if(n==1){
            a[1]=1;
        }else if(n==2){
            a[2]=2;
        }else{
            a[1]=1;
            a[2]=2;
            for(int i=3;i<=n;i++){
                a[i]=a[i-1]+a[i-2];
            }
        }
        return a[n];
    }
}
//简单 参考斐波那契数列即可
