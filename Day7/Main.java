import java.util.*;
public class Main {
  public static int reverse(int x) {
    int ans=revInt(x);
    if(x<0)
        ans*=(-1);
    return ans;
    
}
public static int revInt(int x){
    x=Math.abs(x);
    int c=0;
    int t=x;
    while(x!=0){
        x/=10;
        c++;
    }
    x=t;
    int rev=0;
    for(int i=0;i<c;i++){
        rev=(rev*10)+x%10;
        x/=10;
    }
return rev;
}
  
	    public static void main(String args[]) {
      //String s1="abcabcbb";
      System.out.println(reverse(-12));
		
		
        }
}
	