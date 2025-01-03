package Day18;
import java.util.*;
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //q.element() gives exception when q is empty while peek doesn't
        System.out.println(q.peek());
        //System.out.println(q.remove());
        System.out.println(q.poll());//q.remove() throws exception while poll does not
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.offer(5);// if queue is full then it will give false while add will give exception
        System.out.println(q);
        q.remove();
        System.out.println(q.remove());
        System.out.println(q.poll());//to delete the remaining sources
        
    }
    
}
