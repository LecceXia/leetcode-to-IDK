class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        
        int index1=0;
        int index2=0;
        int start=0;
        
        while(index1<haystack.length()&&index2<needle.length()){
            if(haystack.charAt(index1)==needle.charAt(index2)){
                if(index2==0){
                    start=index1;
                }
                index1++;
                index2++;
            }else{
                start++;
                index1=start;
                index2=0;
            }
        }
        if(index2==needle.length()){
            return index1-index2;
        }
        return -1;
    }
}
