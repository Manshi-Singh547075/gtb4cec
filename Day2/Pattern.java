
import java.util.*;
public class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //Q1
        //for(int i=1;i<=n;i++)
           // System.out.print("* ");

        //Q2
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print("* ");
            
            System.out.println();
            }*/
        sc.close();
        //Q3
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }*/
        //Q4
        /*for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }*/
        //Q5
        /*for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }*/

        //Q6
        /*for(int i=n;i>=1;i--){
            for (int k=(n-i);k>=1;k--)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }

        Q7
        for(int i=5;i>=1;i--){
            for (int k=(n-i);k>=1;k--)
                System.out.print("    ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1|| i==n|| j==1|| j==n){
                    System.out.print("* ");}
                else{
                    System.out.print("  ");}
                }
            System.out.println();
            
        }
            
        Q8
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1)
                    System.out.print("* ");
                else{
                    System.out.print("  ");}

                }
            System.out.println();

            }*/

        //Q9
        /* for(int i=1;i<=n;i++){
            for (int k=(n-i);k>=1;k--)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int j1=2; j1<=i;j1++)
                System.out.print("* ");
            System.out.println();
        }*/

        //Q10
        /*for(int i=n;i>=1;i--){
            for (int k=(n-i);k>=1;k--)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int j1=2; j1<=i;j1++)
                System.out.print("* ");
            System.out.println();
        }*/

        //Q11
        /*for(int i=1;i<=n;i++){
            for (int k=n-i;k>=1;k--)
                System.out.print("  ");
           
            for(int j=1;j<=i;j++){
                if((i+j)%2!=0)
                    System.out.print("  ");
                else
                   System.out.print("* ");}


            for(int j1=2; j1<=i;j1++){
                if((i+j1)%2==0)
                    System.out.print(" * ");
                else
                    System.out.print("  ");}

            System.out.println();
            }*/
            //Q13
           /* for(int i=1;i<=n;i++){
                for (int j=1;j<=i;j++)
                    System.out.print("* ");
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                for (int j=1;j<=i;j++)
                    System.out.print("* ");
                System.out.println();
            }*/ 
        //Q14
       /*  for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++)
                System.out.print("  ");

            for (int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=n-i;k>=1;k--)
                System.out.print("  ");
            for (int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }*/
        //Q15
        /*for(int i=n;i>=1;i--){
            for(int k=n-i;k>=1;k--)
                System.out.print("    ");
            for (int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k=1;k<=n-i;k++)
                System.out.print("    ");
            for (int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }*/
        //Q16
        /*for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++)
                System.out.print("     ");
            for (int j=1;j<=i;j++)
                System.out.print("*  ");
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k=n-i;k>=1;k--)
                System.out.print("     ");
            for (int j=1;j<=i;j++)
                System.out.print("*  ");
            System.out.println();
        }*/
        //Q17
        /*for (int i=n-4; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
        }
        for (int k=4; k<=n-i; k++){
                    System.out.print("  ");
        }
        for (int k=4; k<=n-i; k++){
            System.out.print("  ");}
            for (int j=1; j<=i; j++){
                        System.out.print("* ");
                }

        System.out.println("");
    }
    System.out.println("");

    for (int i=1; i<=n-4; i++){
        for (int j=1; j<=i; j++){
            System.out.print("* ");
    }
    for (int k=4; k<=n-i; k++){
                System.out.print("  ");
    }
    for (int k=4; k<=n-i; k++){
        System.out.print("  ");}
        for (int j=1; j<=i; j++){
                    System.out.print("* ");
            }

    System.out.println("");}*/
    //Q18
    /*for(int i=1;i<=n;i++){
        for (int k=(n-i);k>=1;k--)
            System.out.print("  ");
        for(int j=1;j<=i;j++)
            System.out.print("* ");
        for(int j1=2; j1<=i;j1++)
            System.out.print("* ");
        System.out.println();}
    
    for(int i=n-1;i>=1;i--){
            for (int k=(n-i);k>=1;k--)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int j1=2; j1<=i;j1++)
                System.out.print("* ");
            System.out.println();
    }*/
    //Q21
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int k=1;k<=n-i;k++)
                System.out.println();
            for(int j1=2;j1<=i;j1++)
                System.out.print("* ");
            System.out.println();
     
        }
                

            
    }
}