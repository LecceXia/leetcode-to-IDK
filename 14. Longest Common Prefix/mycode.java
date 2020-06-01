class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=0;
        int flag=0;
        // judge empty
        if(strs.length==0) return "";
        
        min=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(min>strs[i].length()){
                min=strs[i].length();
            }
        }
        String res = new String();
               
        for(int i=0;i<min;i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(c!=strs[j].charAt(i)){
                    return res;
                }
                
            }
            res=res+String.valueOf(c);
        }
        return res;
        
    }
}

//本题没啥难度 暴力即可
