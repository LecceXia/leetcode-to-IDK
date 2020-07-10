class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        int head=0;
        int tail=s.length()-1;
        char chead;
        char ctail;
        while(head<=tail){
            chead=s.charAt(head);
            ctail=s.charAt(tail);
            if(!Character.isLetterOrDigit(chead)){
                head++;
            }else if(!Character.isLetterOrDigit(ctail)){
                tail--;
            }else{
                if(Character.toLowerCase(chead)!=Character.toLowerCase(ctail)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}

//本题只需要注意使用一些库函数即可 Character
