class Solution {
    public String addBinary(String a, String b) {
        String res="";
        int m=a.length()-1;
        int n=b.length()-1;
        int flag=0;
        while(m>=0||n>=0){
            int p = m>=0?a.charAt(m--)-'0':0;
            int q = n>=0?b.charAt(n--)-'0':0;
            int sum=p+q+flag;
            res=String.valueOf(sum%2)+res;
            flag=sum/2;
        }
        return flag==1?"1"+res:res;
    }
}


// 每一位的总和都是 p +q +flag 只有三种情况 0,1,2 sum等于0,2 的时候，计算位都为0, 为1的时候，计算位为1. 且等于2的时候需要进位
