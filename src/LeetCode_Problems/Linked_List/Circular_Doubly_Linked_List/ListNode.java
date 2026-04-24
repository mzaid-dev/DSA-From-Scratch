package LeetCode_Problems.Linked_List.Circular_Doubly_Linked_List;

public class ListNode<T> {
    public T val;
    public ListNode<T> next;
    public ListNode() {}
    public ListNode(T val) { this.val = val; }
    public ListNode(T val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}

