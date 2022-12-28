public class SingleAddBegning {
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
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void display(){
        Node current=head;
        if(current==null){
            System.out.println("linked list is empty");
            return;
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String[] args) {
        SingleAddBegning l=new SingleAddBegning();
        l.addNode(100);
        l.addNode(200);
        l.addNode(300);
        l.display();
    }
}
