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
    public void reorderList(ListNode head) {

        ListNode slow = head;

        ListNode fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;

            fast = fast.next.next;
        }


        ListNode Second = slow.next;

        slow.next = null;

        Second = reverse(Second);

        // merge both 

        ListNode first = head;

        while(Second != null){

            ListNode firstNext = first.next;
            ListNode secondNext = Second.next;


            first.next = Second;
            Second.next = firstNext;


            first = firstNext;
            Second = secondNext;
        }
        
    }

    public  ListNode reverse(ListNode head){

        ListNode prev =  null;

        ListNode curr = head;

        while(curr != null){

            ListNode  next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

        }

        return prev;
    }
}