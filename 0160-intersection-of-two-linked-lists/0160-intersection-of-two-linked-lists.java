/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode startA = headA;
        ListNode startB = headB;

        while (startA != startB) {
            
            startA = (startA == null) ? headB : startA.next;
            startB = (startB == null) ? headA : startB.next;
        }

        return startA;
    }
}