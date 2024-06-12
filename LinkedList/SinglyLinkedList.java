package LinkedList;

// This is the blueprint for a node so take note..

class Node{
    int value;
    // the type is Node because its pointing to the next node. its not pointing to any int or string etc.
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void printLL(){
        Node curr = this.head;
        while(curr!= null){
            System.out.println(curr.value);
            // curr points to the actual node as a whole. not its value or next.
            curr = curr.next;
        }
    }
    void add(int value){
        Node temp = new Node(value);
        if (head ==null){
            head =temp;
        }
        else{
            Node curr = head;
            while (curr.next!=null){
                curr =curr.next;
            }
            curr.next= temp;
        }

    }
    void add_first(int value){
        Node temp = new Node(value);
        if(head ==null){
            head=temp;
        }
        else{
            temp.next =head;
            head = temp;
        }
    }
    void add(int value, int index){
        try {
            Node temp = new Node(value);
            Node curr = head;
            if (index ==0){
                add_first(value);
            }
            else{
                for(int i =0;i<index-1;i++){
                    curr = curr.next;
                }
                temp.next =curr.next;
                curr.next =temp;
            }
        }
        catch(NullPointerException e){
            System.out.println("Array Out of Bounds!");

        }

    }
    void remove_last(){
        if(head ==null){
            System.out.println("The Linked List is already empty!");
        } else if (head.next ==null) {
            head=null;

        }
        else {
            Node curr =head;
            while(curr.next.next!=null){
                curr = curr.next;
            }
            curr.next =null;
        }
    }
    void add_all(int[] array){
        for(int values: array){
            add(values);
        }
    }

    void remove_first(){
        Node temp = head.next;
        head.next =null;
        head = temp;
    }
    void reverse(){
        Node prev =null;
        Node curr = head;
        while(curr!=null){
            curr=head.next;
            head.next=prev;
            prev=head;
            head=curr;
        }
        head=prev;
    }
    // This is also another of of reversing a linked-list but using 3 pointers
//    void reverse(){
//        Node prev =null;
//        Node curr = head;
//        while(curr!=null){
//            Node nextNode = curr.next;
//            curr.next = prev;
//            prev=curr;
//            curr=nextNode;
//
//
//        }
//        head=prev;
//    }
}
public class SinglyLinkedList{


    public static void main(String[] args){
        LinkedList ll =new LinkedList();

        //ll.add(1);
        // ll.add(2);
        //ll.add_first(5);
        //ll.add_first(2);
        //ll.add(200,4);
        int[] array = {1,2,3,4,5};
        ll.add_all(array);
        //ll.remove_last();
        //ll.remove_first();

        ll.reverse();
        ll.printLL();

    }
}
