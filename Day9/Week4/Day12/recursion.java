package Day12;
public class recursion{
    static void print(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    // tail recursion
    static int sum(int n,int s){
        if(n==1){
            return s+n;

        }
        return sum(n-1,s+n);
    }
    //head recursion
    static int sumHead(int n){
        if(n==1){
            return 1;
        }
        return n+sumHead(n-1);

    }
    static int countEven(int n,int count){
        if(n==1){
           return count;
        }
        if(n%2==0)
            count++;
        return countEven(n-1,count);
        
    }
    //head recursion
    static int countEvenHead(int n){
        if(n==1)    
            return 0;
        if(n%2==0)
            return 1+countEvenHead(n-1);
        return countEvenHead(n-1);
    }
    //head recursion
    static int power(int base,int pow){
        if(pow==0)
            return 1;
        return base*power(base,pow-1);
    }
    //tail recursion
    static int powerTail(int base,int pow,int ans){
        if(pow==0)
            return ans;
        return powerTail(base,pow-1,ans*base);

    }
    //Head recursion
    static int factorial(int n){
        if(n==1 || n==0)
            return 1;
        return n*factorial(n-1);
    }
    // tail recursion
    static int factorialTail(int n,int ans){
        if(n==1)
            return ans;
        return factorialTail(n-1, ans*n);}
    //head recu
    static int fibbonaci(int n){
        if(n==0 || n==1){
            return n;
        }
       return fibbonaci(n-1)+fibbonaci(n-2);
    }
    //tail recur
    static int fibb(int n,int ans1,int ans2){
        if(n==0)
            return ans1;
        else if(n==1)
            return ans2;
        return fibb(n-1,ans1,ans2)+fibb(n-2,ans1,ans2);
        

    }
    public static void main(String[] args) {
        //print(1);
        System.out.println(sum(10,0));
        System.out.println(countEven(10,0));
        System.out.println(sumHead(10));
        System.out.println(countEvenHead(10));
        System.out.println(powerTail(2, 3,1));
        System.out.println(factorialTail(5,1));
        System.out.println(fibb(10,0,1));
    }
}