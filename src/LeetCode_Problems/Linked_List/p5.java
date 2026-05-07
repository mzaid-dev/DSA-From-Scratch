package LeetCode_Problems.Linked_List;

//https://leetcode.com/problems/merge-two-sorted-lists/description/

import LeetCode_Problems.Linked_List.Linked_List_Implementation.ListNode;

public class p5 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
               tail.next = list2;
               list2 = list2.next;
            }else {
                tail.next = list1;
                list1 = list1.next;
            }
            tail = tail.next;
        }
        tail.next = (list1 != null) ? list1 : list2;
        return  dummy.next;
    }

    public static void main(String[] args) {
        ListNode A1 = new ListNode(1);
        ListNode A2 = new ListNode(5);

//      connect these nodes
        A1.next = A2;

//      second sll
        ListNode B1 = new ListNode(2);
        ListNode B2 = new ListNode(4);
        ListNode B3 = new ListNode(9);

//      connect these nodes
        B1.next = B2;
        B2.next = B3;

        ListNode sortedLL = mergeTwoLists(A1,B1);
        ListNode temp = sortedLL;
        while (temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
