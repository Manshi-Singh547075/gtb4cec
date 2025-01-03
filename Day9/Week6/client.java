package Week6;

import Week6.Linklist.Node;

public class client {
    public static void main(String[] args) {
        Linklist ll=new Linklist();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(0);
        ll.addAtIndex(99, 2);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.getIndex(4));
        System.out.println(ll.getNode(2));
        //System.out.println(ll.removeFirst());
        //System.out.println(ll.removeLast());
        System.out.println(ll.removeIndex(1));
        ll.display();
    }

    
}
