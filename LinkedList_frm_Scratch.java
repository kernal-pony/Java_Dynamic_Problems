


class LinkedList_frm_Scratch 
{

    
    Node head;
    private int size;
 
 
    LinkedList_frm_Scratch () // constructor of linkedlist class
    {
        size = 0;
    }
 
 
    public class Node // similar to struc in c++
    {
        String data; // string type data>>  can be any type
        Node next;
 
 
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
 
 
    public void addFirst(String data) {
        Node newNode = new Node(data); // obj node creating of node class
        newNode.next = head;
        head = newNode;
    }
 
 
    public void addLast(String data) {
        Node newNode = new Node(data); // creating new node everytime
 
 
        if(head == null) {
            head = newNode;
            return;
        }
 
 
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
 
 
        currNode.next = newNode;
    }
 
 
    public void printList() {
        Node currNode = head; // for traversing in linkedList without distbing the starting head or 1st list
 
 
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
 
 
        System.out.println("null");
    }
 
 
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        head = head.next;
        size--;
    }
 
 
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
 
 
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
 
 
        currNode.next = null; // previously this was the second last node .. now making it last
    }
 
 
    public int getSize() {
        return size;
    }
  
 
 
    public static void main(String args[]) 
    {
        


        LinkedList_frm_Scratch list = new LinkedList_frm_Scratch();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
 
 
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize()); 
 
 
        list.removeFirst();
        list.printList();
 
 
        list.removeLast();
        list.printList();

    System.out.println(list.getSize());    }
 }
 