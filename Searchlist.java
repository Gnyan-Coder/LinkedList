class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    // public void printList(Node head){
    //     Node curr=head;
    //     while(curr!=null){
    //         System.out.println(curr.data+"->");
    //         curr=curr.next;
    //     }
    // }
    // public boolean searchList(Node head,int x){
    //     Node curr=head;
    //     while(curr!=null){
    //         if(curr.data==x){
    //             return true;
    //         }
    //         curr=curr.next;
    //     }
    //     return false;
    // }

}

public class Searchlist {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        // head.next.next.next=new Node(40);
        // head.printList(head);
        // System.out.println(head.searchList(head, 30));

        
    }
}

