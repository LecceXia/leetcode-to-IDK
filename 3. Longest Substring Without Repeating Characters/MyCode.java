class Solution {
    public int lengthOfLongestSubstring(String s) {      
        int res = 0, left = 0, right = 0;
        HashSet<Character> t = new HashSet<Character>();
        while (right < s.length()) {
            if (!t.contains(s.charAt(right))) {
                t.add(s.charAt(right)); 
                res = Math.max(res, t.size());
                System.out.println("right: "+right);
                right++; 
            } else {
                t.remove(s.charAt(left));
                System.out.println("left: "+left);
                left++;
            }
        }
        return res;
        
    }
}
