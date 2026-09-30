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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode answer = new ListNode();
        ListNode node = answer;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                //setting next node as list1 since <list2
                node.next = list1;
                //making the start of the list1 the next node since it got added
                list1 = list1.next;
                //advancing the tail pointer
                node = node.next;
            } else {
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
        }

        if (list1 == null){
            node.next = list2;
        } else {
            node.next = list1;
        }

        return answer.next;

        
        

        
        
    }
}