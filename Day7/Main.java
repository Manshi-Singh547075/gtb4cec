
import java.util.*;
public class Main {
    public static int replace(int n){
		if(n==0)
        return 5;
		int res=0;
		int a=1;
		while(n>0){
            int digit=n%10;
            if(digit==0)
                digit=5;
            res+=digit*a;
            a*=10;
            n/=10;
        }
		return res;	
	}
		
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(replace(n));

    }
   
}

