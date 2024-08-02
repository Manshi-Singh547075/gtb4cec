package Day9;

public class wrapperClass {
    public static void main(String[] args) {
        int x=10;
        Integer i=x; // Autoboxing
        int z=i; // Unboxing
        int a=499;
        int b=499;
        Integer c=499;
        Integer d=499;
        Integer e=100; // -128<=Integer array<=127
        Integer f=100;
        System.out.println(a==d);
        System.out.println(f==e);
        System.out.println(c==d);
        System.out.println(z);

    }
    
}
