
//  Definition for singly-linked list.
 public class ListNode {
     int val;  //vvalue of the node 
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode PrintLinkedList(ListNode head) {
        while(head!=null)
        {
        System.out.println(head.val);
        head=head.next;
        }
        return null;
    }
}

//main function to test the code
class Main
{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution obj = new Solution();
        obj.PrintLinkedList(head);
    }
}