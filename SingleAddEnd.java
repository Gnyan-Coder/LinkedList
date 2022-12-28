public class SingleAddEnd {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("Single linked list is sempty");
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        SingleAddEnd l=new SingleAddEnd();
        l.addNode(10);
        l.addNode(20);
        l.addNode(30);
        l.display();
    }
}
