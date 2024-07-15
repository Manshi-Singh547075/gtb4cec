
public class Arrays{
    public static void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static boolean primeNumber(int n) {
        if(n==1)
            return false;
        if(n==2||n==3)
            return true;
        if (n%2==0) 
            return false;
        if(n%3==0)
            return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0||n%(i+2)==0)
                return false;
    
            }
        return true;
    }
    public static int reverse(int n) {
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static int len(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static boolean armstrong(int n){
        int temp=n;
        int sum=0;
        int c=len(9);
        for(int i=1;i<=c;i++){
            sum+=Math.pow(temp%10,c);
            temp/=10;}
        if(sum==n)
            return true;
        return false;

    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[1]=10;
        arr[6]=110;
        arr[9]=101;
        displayArray(arr);
        System.out.println();
        System.out.println(primeNumber(25));
        System.out.println(reverse(1234));
        System.out.println(armstrong(9));
    }
    
}
