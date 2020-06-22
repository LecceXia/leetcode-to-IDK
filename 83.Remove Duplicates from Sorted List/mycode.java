class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null||head.next==null) return head;
        ListNode dummy = head;
        while(dummy.next!=null){
            if(dummy.next.val==dummy.val){
                dummy.next=dummy.next.next;
            }else{
                dummy=dummy.next;
            }
        }
        return head;
    }
}

//这个简单 按顺序排查就行，开始还想复杂了，以为是乱序的listnode
