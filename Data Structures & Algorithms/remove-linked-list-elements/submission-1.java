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
    public ListNode removeElements(ListNode head, int val) {

        

        while (head != null && head.val == val){
            head = head.next;
        }

        if( head == null){
            return null;
        }

        //looking through the body/rest of the list
        ListNode current = head;
        while( current.next!= null){
            //remove the matched val
            if(current.next.val == val){
                current.next = current.next.next;
            //continues if the match did not happen
            } else {
                current = current.next;
            }

        }

        return head;


        
    }
}