package Day18;

public class Client{
    public static void main(String[] args) {
        // Node n1=new Node(12);
        // Node n2=new Node(50);
        // Node n3=new Node(29);
        // n1.next=n2;
        // Node head= n1;
        // Node temp=n2;
        // temp=n2.next;
        // n2.next=n3;
        // System.out.println("Node 1"+n1);
        // System.out.println("Node 2"+n2);
        // System.out.println("Node 3"+n3);
        // System.out.println(n1.next);
        // System.out.println(n2.next);
        MyLinklist list=new MyLinklist();
        // list.insertAtBegin(4);
        // list.insertAtBegin(3);
        // list.insertAtBegin(2);
        // list.insertAtBegin(1);
        list.insertAtEnd(5);
        list.display();

    }
    
}
