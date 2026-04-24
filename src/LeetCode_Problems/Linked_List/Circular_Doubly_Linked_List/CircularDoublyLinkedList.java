package LeetCode_Problems.Linked_List.Circular_Doubly_Linked_List;

public class CircularDoublyLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node (T data_){
            data = data_;
            next = null;
            prev = null;
        }


        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CircularDoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T data){

        Node<T> newNode = new Node<>(data);

        if (head == null){
            head = tail = newNode;
            head.prev = head;
            head.next = head;
            size++;
            return;
        }

        newNode.prev = tail;
        newNode.next = head;

        tail.next = newNode;
        head.prev = newNode;

        tail = newNode;

        size++;

    }


    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node<T> temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

}
