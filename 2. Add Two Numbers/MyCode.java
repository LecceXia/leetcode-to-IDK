/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { 
            val = x; 
        }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = new ListNode(0);
        ListNode list = list1;
        int flag=0;
        while(l1!=null||l2!=null){
            int value1 = l1==null?0:l1.val;
            int value2 = l2==null?0:l2.val;
            int sum = value1+value2+flag;          
            if(sum>=10){
                flag=1;
            }else{
                flag=0;
            }
            System.out.println(sum%10);
            list.next = new ListNode(sum%10);
            list = list.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }   
        if (flag == 1){
            list.next = new ListNode(1);
        } 
        return list1.next;
    }
}
