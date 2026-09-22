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
        List<Integer> lst = new ArrayList<>();
        ListNode cur = head;
        while (cur != null){
            lst.add(cur.val);
            cur = cur.next;
        }
        Collections.reverse(lst);
        lst.remove(n-1);
        if (lst.size() <= 0){
            return null;
        }
        ListNode dup = new ListNode();
        dup.val = lst.get(lst.size()-1);
        ListNode curr = dup;
        for (int i = lst.size()-2; i >= 0; i--){
            ListNode newNode = new ListNode(lst.get(i));
            curr.next = newNode;
            curr = curr.next;
        }
        return dup;
    }
}