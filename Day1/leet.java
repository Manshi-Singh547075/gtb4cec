public class leet {
    public static int[] plusOne(int[] digits) {
        int n= digits.length;
        int l=digits[n-1];
        
        while(l==9){
            if(n==1){
                int[] arr=new int[2];
                arr[0]=1;
                arr[1]=0;
                return arr;}
            digits[n-1]=0;
            digits[n-2]+=1;
            return digits;
        }
        digits[n-1]+=1;
        return digits;
        
    }
        
    public static void main(String[] args) {
        int[] arr={9};
        System.out.println(plusOne(arr));    
    }
    
}
