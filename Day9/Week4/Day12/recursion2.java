package Day12;

public class recursion2 {
    //tail recursion
    public  static void coinToss(int n,String ans){
        if(n==0){
            System.out.println(ans);
        }
        else{
            coinToss(n-1,ans+"H");
            coinToss(n-1,ans+"T");

        }
        
    }
    public static void generateSeq(String q,String ans){
        if(q.isEmpty()){
            System.out.println(ans);
            return;
        }
        else{
            generateSeq(q.substring(1),ans+q.charAt(0));
            generateSeq(q.substring(1),ans);
        }
    }
    public static int countSeq(String s){
        if(s.isEmpty()){
            return 1;
        }     
        int n1=countSeq(s.substring(1));
        //int n2=countSeq(s.substring(1));
        return n1*2;

    }
    public static void validParanthesis(int n,int l,int r,String ans){
        if(l==n && l==r){
            System.out.println(ans);
            return;}
        if(r<=l && l<=n){
            validParanthesis(n,l+1,r,ans+"{");
            validParanthesis(n, l, r+1, ans+"}");
        }
    }
    public static void towerOfHanoi(int n,String start,String mid,String end){
        if(n==0)
            return;
        

    }

    public static void main(String[] args) {
        coinToss(3,"");
        generateSeq("TAP", "");
        System.out.println(countSeq("CAR"));
        validParanthesis(3, 0, 0,"");


    }
    
}
