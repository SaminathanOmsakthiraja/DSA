import java.util.*;

 //Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNodeAtEndOfTheList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dup = new ListNode();
        dup.next = head;
        ListNode cur = dup;
        int len = 0;
        while(cur.next != null){
            len++;
            cur = cur.next;
        }
        int idx = len - n;
        ListNode curr = dup;
        while(idx != 0){
            curr = curr.next;
            idx--;
        }
        curr.next = curr.next.next;
        return dup.next;
    }
}