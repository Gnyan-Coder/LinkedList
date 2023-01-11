
// delete the node with only pointer given
class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
    public void displya(Node2 head){
        Node2 curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }

    public void deleteNode(Node2 ptr){
        Node2 temp=ptr.next;
        ptr.data=temp.data;
        ptr.next=temp.next;

    }
}
public class Deletesinglepos {
    public static void main(String[] args) {
        Node2 head=new Node2(20);
        head.next=new Node2(10);
        head.next.next=new Node2(30);
        head.next.next=new Node2(40);
        // head.displya(head);
        head.deleteNode(head);
        head.displya(head);

        
        
    }
    
}
