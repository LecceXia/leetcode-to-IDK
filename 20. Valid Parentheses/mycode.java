class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        char[] strs = s.toCharArray();
        
        for(int i=0;i<strs.length;i++){
            if(strs[i]=='('||strs[i]=='['||strs[i]=='{'){
                st.push(strs[i]);
            }else{
                if(st.empty()) return false;
                if(strs[i]==')'&&st.peek()!='(') return false;
                if(strs[i]==']'&&st.peek()!='[') return false;
                if(strs[i]=='}'&&st.peek()!='{') return false;
                st.pop();
            }
        }
        return st.empty();
    }
}

//本题涉及到Stack类 pop push peek empty 方法
