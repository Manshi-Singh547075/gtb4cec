package Day9;

import java.util.*;
public class arraylist {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l=new ArrayList<>();
    
        for(int i=0;i<words.length;i++){
            for(int j=0;i<words[i].length();i++){
                if(words[i].charAt(j)==x){
                    l.add(i);
                    continue;
                }
            }
        }
        return l;
    }
    public static String kthDistinct(String[] arr, int k) {
        ArrayList<String> s=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            //for(int j=0;j<arr.length;j++){
               // if(arr[i].equals(arr[j])){}
                //else
            if (i == 0 || !arr[i].equals(arr[i - 1]))
                s.add(arr[i]);
            
        }
        if(s.size()<k)
            return "";
        return s.get(k-1);
    }
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
        String[] s={"d","b","c","b","c","a"};
        System.out.println(kthDistinct(s,2));
        String s1="hi";
        String s2="hie";
        System.out.println(s1.equals(s2));
        //System.out.println(findWordsContaining(words,'a'));
    }
    
}
