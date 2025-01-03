package Week6;
public class Linklist {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;



    public void addFirst(int item){
        Node n=new Node();
        n.data=item;
        if(size==0){
            head=n;
            tail=n;
            
        }
        else{
            n.next=head; // first create link
            head=n;
            
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public int size(){
        return size;
    }
    
    public void addLast(int item){
        Node n=new Node();
        if(size==0){
            addFirst(item);
        }
        else{
            n.data=item;
            tail.next=n;
            n.next=null;
            tail=n;
            size++;
        
            }
        }

        public Node getNode(int index){
            Node temp=head;
            for(int i=0;i<index;i++)
                temp=temp.next;
            return temp;
            
        }

        public void addAtIndex(int item,int index){
            if(index==0)
                addFirst(item);
            else if(index==size)
                addLast(item);
            else{
                Node n=new Node();
                n.data=item;
                Node k_1th=getNode(index-1);
                n.next=k_1th.next;
                k_1th.next=n;
                size++;
            }
            
        }

        public int getStart(){
            return head.data;
        }
        public int getEnd(){
            return tail.data;
        }
        public int getIndex(int index){
            if(index==0)
                return getStart();
            else if(index==size)
                return getEnd();
            else
                return getNode(index).data;
        }
          public int removeFirst(){
            int rn=head.data;
            if(size==1){
                head=null;
                tail=null;
            }
            else{
                Node temp=head;
                head=head.next;
                temp.next=null;
            }
            size--;
            return rn;
          }

          public int removeLast(){
            int rn=tail.data;
            if(size==1){
                removeFirst();
            }
            else{
                Node temp=head;
                while(temp.next!=tail){
                    temp=temp.next;
                }
                temp.next=null;
                tail=temp;
                size--;

            }
            return rn;

          }

          public int removeIndex(int index){
                int rn=getIndex(index);
                if(index==0){
                    return removeFirst();
                }
                else if(index==size-1){
                    return removeLast();
                }
                else{
                    Node k_th=getNode(index-1);
                    Node temp=k_th.next;
                    k_th.next=temp.next;
                    temp.next=null;
                    size--;
                    return rn;
                }
            
          }
    }
    
    

