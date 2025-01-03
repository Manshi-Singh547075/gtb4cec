package Day16;

import java.util.*;

public class stack {
    public static void addElements(int n){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            s.push(num);
            System.out.println(s);
        }
    }
    public static void display(Stack<Integer> stk){
        while(!stk.empty())
            System.out.println(stk.pop());
    }
     public static void nextGreater(int[] arr){
        int[] arr1=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && s.peek()<arr[i])
                s.pop();
            if(s.empty())
                arr1[i]=-1;
            else
                arr1[i]=s.peek();
            s.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
     }

     public static void nextSmaller(int[] arr){
        int[] arr1=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.empty() && s.peek()>arr[i])
                s.pop();
            if(s.empty())
                arr1[i]=-1;
            else
                arr1[i]=s.peek();
            s.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
     }
    
    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<>();
        
        stk.push(5);
        stk.push(7);
        stk.push(3);
        stk.push(9);
        stk.push(8);
        stk.push(2);
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk);
        System.out.println(stk.search(7));
        System.out.println(stk.size()-stk.search(3));
        int[] num={7,3,4,5,9,2};
        nextGreater(num);
        System.out.println();
        nextSmaller(num);
    
        //addElements(5);
        //display(stk);
        Stack<Integer> s1= new Stack<>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n=sc.nextInt();
            s1.push(n);
            
        }
        System.out.println(s1);
        
    }
    
}
