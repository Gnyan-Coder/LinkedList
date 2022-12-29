public class SingleAddMid {
    class Node{
        int data;
        Node next;
        pulbic Node(int data){
            this.data=data;
            this.next=null;

        }
    }

    public Node head=null;
    public Node tail=null;

    public void addNode(int data,int position){
        Node temp=head;

    }

    public void display(){
        Node current=head;
        if(current==null){
            System.out.println("list is empty");
        }
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

}
