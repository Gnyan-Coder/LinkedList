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
    // add node in midle of linked list

    public void addMid(int data,int position){
        if(position==1){
            addFirt(data);
            return;
        }
        if(size==position){
            addEnd(data);
            return;
        }
        Node temp=head;
        int cnt=1;
        while(cnt<position-1){
            temp=temp.next;
            cnt++;
        }
        // creating node for data
        Node nodeToInsert=new Node(data);
        nodeToInsert.next=temp.next;
        temp.next=nodeToInsert;
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

    // delete node in middle in linkd list

    public void deleteMid(int position){
        if(position==1){
            deleteFirst();
            return;
        }
        if(position==size){
            deleteLast();
            return;
        }
        Node curr=head;
        Node prev=null;
        int cnt=1;
        while(cnt<position){
            prev=curr;
            curr=curr.next;
            cnt++;
        }
        size--;
        prev.next=curr.next;
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
        list.addEnd(100);
        list.addEnd(200);
        list.addEnd(300);
        list.addEnd(400);
        System.out.println("Display the added at the end added list");
        list.display();
        System.out.println("dfnsodfnsdofnso");
        list.deleteMid(2);
        list.display();
        System.out.println(list.size);
    

    }
}
