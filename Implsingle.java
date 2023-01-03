class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    public void printList(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;

        }

    }

}


public class Implsingle {
    public static void main(String[] args) {
       Node head=new Node(10);
       head.next=new Node(20);
       head.next.next=new Node(30);
       head.printList(head);
    }
}