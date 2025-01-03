package Day18;

public class MyLinklist {
    private Node head =null;
    public void insertAtBegin(int val){
        Node n=new Node(val);
        n.next = head;
        head = n;
        
    }
    public void insertAtEnd(int val){
        Node newNode=new Node(val);
        Node n=head;
        if(head==null){
            insertAtBegin(val);
        }
        while(n!=null){
            if(n.next==null){
                n.next=newNode;
                newNode.next=null;
            }
            n=n.next;

        }

    }
    public void display(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    
}
