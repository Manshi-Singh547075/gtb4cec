package Day10;

public class class1 {
    public static void display(Students s) {
        System.out.println(s.name);
        System.out.println(s.rollno);
        System.out.println(s.sem );
        System.out.println(s.year);
        if(s.getBranchCode()<0 || s.getBranchCode()>4)
            System.out.println("No branch assigned");
        else
            System.out.println(s.branch.branches[s.getBranchCode()]);
        }

    
    public static void main(String[] args) {
        Students s1=new Students();
        display(s1);
        Students s2=new Students(76,"Manshi",5,3,0);
        s2.setBranchCode(3);
        display(s2);
        Students s3= new Students("Saima",1,1);
        display(s3);

    }
    
}
