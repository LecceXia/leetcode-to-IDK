class Solution {
    public int myAtoi(String str) {
        int index=0;
        int sign=1;
        int total=0;
        
        //delete empty
        if(str.length()==0) return 0;
        
        
        //delete whitesapce
        while(index<str.length()&&str.charAt(index)==' '){  //while中&&执行的先后顺序要注意，应该首先判断数组是否越界再判断符号
            index++;
        }
        
        //all are whitespace
        if(index==str.length()) return 0;              // 这里不能删除，因为首先要把异常情况排除，否则对下面判断符号会造成数组越界
        
        // get the sign  only judge one time
        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            if(index+1==str.length()){
                return 0;
            }
            index++;
        }
        
        
        while(index<str.length()){
            int digit=str.charAt(index)-'0';
            if(digit<0||digit>9){
                break;
            }
            
            if(Integer.MAX_VALUE/10<total||Integer.MAX_VALUE/10==total&&Integer.MAX_VALUE%10<digit){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }
            
            total=total*10+digit;
            index++;
        }
        return sign*total;
        
    }
}
//本题需注意" " 且将加减号叠加视作错误
