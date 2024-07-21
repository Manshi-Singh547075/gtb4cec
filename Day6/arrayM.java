package Day6;

public class arrayM {
    static void subArray(int[] arr){
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    maxSum=Math.max(sum,maxSum);}
            }
        } 
        System.out.println(maxSum);           
        
    }
    //KADANE'S ALGORITHM
    static int Kadane(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            maxSum=Math.max(currsum,maxSum);
            if(currsum<0)
                currsum=0;
        }
        return maxSum;
    }
    static void rotateByOne(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=temp;
        
}
static void rotateArr(int[] arr,int k){
    for(int j=0;j<k;j++){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=temp;}
    
}

public static void display(int[] arr){
    for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
}
    public static void main(String[] args) {
        int[] arr = {-1,-2,-4,-5,-6};
        subArray(arr);
        Kadane(arr);
        //rotateArr(arr,3);
        display(arr);
    }
    
}
