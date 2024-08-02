package Day9;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(2);
        System.out.println(arr.size());
        arr.add(10);
        arr.add(50);
        arr.add(200);
        arr.add(40);
        System.out.println(arr.get(0)+" ");
        System.out.print(arr.get(1)+" ");
        System.out.print(arr.get(2));
        System.out.println(arr.remove(0));
        System.out.println(arr.get(0));
        System.out.println(arr.set(0,1));//displays element that was updated
        System.out.println(arr.get(0));
        Collections.sort(arr);
        System.out.println(arr);
    }
    
}
