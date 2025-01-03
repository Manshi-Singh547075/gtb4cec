package Day17;
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static Map arryToMap(int[] arr){
        Map<Integer,Integer> M=new HashMap<>();
        for(int i:arr){
            if(M.containsKey(i)){
                M.put(i,M.get(i)+1);}
                // M.put(i,M.getOrDefault(i,0)+1);
            else
                M.put(i,1);
        }
        return M;


    }
    //Moore algorithm
    public static int MooreAlgo(int[] arr){
        int c=0,candidate=0;
        for(int i=0;i<arr.length;i++){
            if(c==0)
                candidate=arr[i];
            if(arr[i]==candidate)
                c++;
            else    
                c--;
        }
        return candidate;

    }
    public static void main(String[] args) {
        HashMap<Integer,String> mp=new HashMap<>();
        int[] arr={1,2,3,4,1,2,3,3,3,2};
        mp.put(1,"Manshi");
        mp.put(2,"Ashi");
        mp.put(3, "Priyanka");
        mp.put(4,null);
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(1,2);
        m.put(2,3);
        m.put(3,4);
        m.put(4,1);
        m.put(5,null);
        System.out.println(mp);
        System.out.println(m);
        m.put(1,1);
        m.put(4,2);
        m.remove(3);
        System.out.println(m);
        System.out.println(m.containsKey(1));
        System.out.println(m.containsKey(3)); 
        System.out.println(m.get(5));   
        for(Map.Entry m1:m.entrySet()){
            System.out.println("Key is:"+m1.getKey()+" value is:"+m1.getValue());
        }    
        System.out.println(arryToMap(arr));
        System.out.println(MooreAlgo(arr));
    }
    
}
