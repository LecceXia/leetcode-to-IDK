class Solution {
    public int lengthOfLastWord(String s) {
        int index=s.length()-1;
        int count=0;

        while(index>=0){
            if(s.charAt(index)!=' '){
                count++;
            }
            index--;
            if(index>=0&&s.charAt(index)==' '&&count>0){
                return count;
            }
            
        }
        return count;
    }
}

## 注意 "a "
