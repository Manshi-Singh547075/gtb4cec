package Day10;

public class Students {
    int rollno=0;
    String name="";
    int sem=0;
    int year=0;
    private int branch_code=-1;
    Branch branch=new Branch();

    public Students()
    {}

    public Students(int rollno, String s, int sem, int year, int branch){
        this.rollno=rollno;
        this.name=s;
        this.sem=sem;
        this.year=year;
        this.branch_code=branch;


    }

    public Students( String s, int sem, int year){
        this.name=s;
        this.sem=sem;
        this.year=year;
    }
    // Getters and setters
    int getBranchCode(){
        return this.branch_code;
    }
    void setBranchCode(int code){
        this.branch_code=code;
    }

    
}
