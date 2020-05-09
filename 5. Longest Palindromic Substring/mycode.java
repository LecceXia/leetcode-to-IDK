class Solution {
    public String longestPalindrome(String s) {
        String max="";
        
        if(s.length()<=1){
            return s;
        }
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)){
                return s;
            }else{
                max=max+s.charAt(0);
                return max;
            }
        }
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                int m=i;
                int n=j; 
                boolean flag=false;
                if(s.charAt(i)==s.charAt(j)){                
                    for(m=i,n=j;m<=n;m++,n--){
                        if(s.charAt(m)==s.charAt(n)){
                            flag=true;
                        }else{
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag==true){
                    int len=j-i+1;
                    if(len>max.length()){
                        String ins="";
                        for(int k=i;k<=j;k++){
                            ins=ins+s.charAt(k);
                        }
                        max=ins;
                    }
                }
            }
        }
        if(max==""){
            max=max+s.charAt(0);
        }
        return max;
    }
}
