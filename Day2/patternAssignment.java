public class patternAssignment {
    public static void main(String[] args) {
        int n = 5;
        //Q21
       /*  for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int k=n-i;k>=1;k--)
                System.out.print("  ");
            for(int j2=1;j2<=i;j2++)
                System.out.print("* ");
            System.out.println();}*/
        
        //Q22
        /*for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int k=n-i;k>=1;k--)
                System.out.print("  ");
            for(int j1=2;j1<=i;j1++)
                System.out.print("* ");
            System.out.println();
        }
    //Q23
        for(int i=1;i<=n;i++){
            for(int k=(n-i);k>=1;k--)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("1 ");
            for(int j1=2;j1<=i;j1++)
                System.out.print("1 ");
            System.out.println();}*/

    //Q24
    /*for(int i=1;i<=n;i++){
        for(int k=(n-i);k>=1;k--)
            System.out.print("  ");
        for(int j=1;j<=i;j++){
            if(i==1)
            System.out.print("1 ");
            if(i==2)
            System.out.print("2 ");
            if(i==3)
            System.out.print("3 ");
            if(i==4)
            System.out.print("4 ");
            if(i==5)
            System.out.print("5 ");
        }
            
        for(int j1=2;j1<=i;j1++){
            if(i==2)
            System.out.print("2 ");
            if(i==3)
            System.out.print("3 ");
            if(i==4)
            System.out.print("4 ");
            if(i==5)
            System.out.print("5 ");
        }
           
        System.out.println();}*/
    //Q25
    /*for(int i=1;i<=n;i++){
        for(int k=(n-i);k>=1;k--)
            System.out.print("  ");
        for(int j=1;j<=i;j++){
            for(int x=1;x<=n*n;x++)
                System.out.print(x);}
        for(int j1=2;j1<=i;j1++)
            System.out.print("1 ");
        System.out.println();}*/

    //Q26
    /*for(int i=1;i<=n;i++){
        for(int k=(n-i);k>=1;k--)
            System.out.print("  ");
        for(int j=1;j<=i;j++){
            if(i+j==n+1)
                System.out.print("1 ");
            if(i+j==n+2)
                System.out.print("2 ");
            if(i+j==n+3)
                System.out.print("3 ");
            if(i+j==n+4)
                System.out.print("4 ");
            if(i+j==n+5)
                System.out.print("5 ");
            }
        for(int j1=2;j1<=i;j1++){
            if(i+j1==n-1)
                System.out.print("3 ");
            if(i+j1==n)
                System.out.print("4 ");
            if(i+j1==n+1)
                System.out.print("5 ");
            
            if(i+j1==n+2)
                System.out.print("6 ");
            if(i+j1==n+3)
                System.out.print("7 ");
            if(i+j1==n+4)
                System.out.print("8 ");
            if(i+j1==n+5)
                System.out.print("9 ");
        }
            
        System.out.println();}*/
    //Q27
    /*for(int i=1;i<=n;i++){
        for(int k=(n-i);k>=1;k--)
            System.out.print("  ");
        for(int j=1;j<=i;j++){
            for(int a=1;a<=i;a++)
                System.out.print(a+" ");

        }
        for(int j1=2;j1<=i;j1++){
            for(int a=i-1;a>=1;a--)
             System.out.print(a+" ");

        }
            
        System.out.println();}*/
    //Q28
    /*for(int i=1;i<=n;i++){
        for(int k=(n-i);k>=1;k--)
            System.out.print("  ");
        for(int j=1;j<=i;j++){
            if(i+j==n+1)
                System.out.print(i+" ");
            System.out.print("0 ");
        }
        for(int j1=2;j1<=i;j1++)
            System.out.print("1 ");
        System.out.println();}*/

    //Q30
    /*for(int i=1;i<=n;i++){
        int a=n;
        for(int j=1;j<=n;j++){
            System.out.print(a+" ");
            a--;}
        System.out.println();}*/
    
    //Q31
    for(int i=1;i<=n;i++){
        int a=n;
        for(int j=1;j<=n;j++){
                if(i+j==n+1)
                    System.out.print("* ");
                System.out.print(a+" ");
                a--;}
            
    System.out.println();}
    //Q32
    for(int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            if(j%2!=0)
                System.out.print(j+" ");
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=n-1;i>=1;i--){
        for (int j1=1;j1<=i;j1++){
            if(j1%2!=0)
                System.out.print(j1+" ");
            System.out.print("* ");
        }
           
        System.out.println();
    }
            
        
        
        
    }
}
    

