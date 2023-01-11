
class Node3{
    int data;
    Node3 next;
    Node3 prev;
    public Node3(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}


public class DL {
    public static void print(Node3 head){
        Node3 curr=head;
        while(curr!=null){
            System.out.print(curr.data+"<-->");
            curr=curr.next;
        }
    }


    public static void main(String[] args) {
        Node3 head=new Node3(10);
        Node3 temp1=new Node3(20);
        Node3 temp2=new Node3(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;  
        print(head);
    }
}
