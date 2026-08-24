/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if (head == null || head.next == null) {
            return head;
        }
        if(head.next!=null && head.val==head.next.val){
                int value=head.val;

                while(head!=null && head.val==value){
                    head=head.next;
                }
            return deleteDuplicates(head);
        }
        head.next = deleteDuplicates(head.next);

        return head;
            
    }
}
