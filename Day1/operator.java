public class operator {
    public static void main(String[] args) {
        //Arithmetic operator
        int a=2,b=3;
        a= a+b;//5
        b=b+a;//8
        a=a-b;//-3
        b=b-a;//11
       
        System.out.println(a);
        //2.Comparison operators
        //[<,>,!,==,<=,=>]
        //3.Logical operators: &&, || , !
        //if(!(a>b|| a<10))
        //4. Assignment operator
        //x+=3
        //x-=3
        //homework: bitwise= &,|,^,>>,<<
        int sum=0;
        for(int i=1;i<=25;i++){
           sum=sum+i;
           System.out.print(sum+" , ");
        }
        //int x=5;
       
        /*while (x<15) {
           x++;
           if(x%2==0)
                System.out.println(x);
                
           elif(x%7==0)
                System.out.println(x);
                
        }*/
            
        
         
        
    }
}
