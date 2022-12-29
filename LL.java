public class LL {
    Node head=null;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
// add the node at the begning of the liked list
    public void addFirt(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
// add the node  at end of linked lsit
    public void addEnd(int data){   
        Node newNode=new Node(data);    
        if(head==null){
            head=newNode;   
            return;
        }else{
           Node lastNode=head;
           while(lastNode.next!=null){
            lastNode=lastNode.next;
           } 
           lastNode.next=newNode;
        }  
    }

    // delete the first node of linked list
    public void deleteFirst(){
        if(head==null){
            System.out.println("the lsit is empty");
            return;
        }
        size--;
        head=head.next;
    }

    // delete last node of the liked list
    public void deleteLast(){
        if(head==null){
            System.out.println("the lsit is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }




    // print the linked list
    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list=new LL();
        // list.addFirt(10);
        // list.addFirt(20);
        // list.addFirt(30);
        // list.addFirt(40);
        // System.out.println("Display the added first added list");
        // list.display();
        list.addEnd(100);
        list.addEnd(200);
        list.addEnd(300);
        list.addEnd(400);
        System.out.println("Display the added at the end added list");
        list.display();
        System.out.println("delete firts");
        list.deleteFirst();
        list.display();
        System.out.println("delete lastnode");
        list.deleteLast();
        list.display();
       System.out.println( "size of the node"+list.getSize());

    }
}
