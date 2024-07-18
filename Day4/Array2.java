package Day4;

public class Array2{
    public static int sumArr(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        return sum;
    }

    public static int findArr(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n)
                return i;
            }
        return -1;
    }
    public static void swap(int a,int b) {
        int temp = a;
        a = b;
        b=temp;
        System.out.println("a:"+a+" and b:"+b);
    }

    public static void change(int[] arr2, int i,int j){
        int temp=arr2[i];
        arr2[i]=arr2[j];
        arr2[j]=temp;
    }

    public static void arrRev(int[] arr,int i, int j){
        while (i<j) {
            change(arr,i,j);
            i++;
            j--;}
        
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
    public static int arrMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            
        }
        return max;

    }
    public static void bubbleSort(int[] arr){
        for(int i=1;i<=arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;}
            }
        }

    }
    
    
    public static void main(String[] args) {
        int arr[]={67,9,23,65,98,34,22};
        System.out.println(sumArr(arr));
        System.out.println(findArr(arr,7));
        int a=7,b=9;
        swap(a,b);
        System.out.println("a:"+a+" and b:"+b);
        arrRev(arr,1,3);
        display(arr);
        System.out.println();
        System.out.println(arrMax(arr));
        bubbleSort(arr);
        display(arr);
    
    }
}