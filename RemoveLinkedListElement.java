class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dup = new ListNode(0);
        dup.next = head;
        ListNode curr = dup;
        while(curr.next != null){
            if (curr.next.val == val){
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }
        return dup.next;
    }
}
