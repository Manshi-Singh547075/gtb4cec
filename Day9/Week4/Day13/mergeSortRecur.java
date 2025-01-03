public class mergeSortRecur {
    static void merge(int[] arr,int low, int mid, int high){
        int size=high-low+1;
        int[] temp= new int[size];
        int i=mid,j=high,k=size-1;
        while (i>=low && j>=mid+1) {
            if(arr[i]>arr[j]){
                temp[k]=arr[i--];
            }
            else
                temp[k]=arr[j--];
            k--;
        }
        while (j>=mid+1) {
            temp[k]=arr[j];
            k--;j--;
            
        }
        while(i>=low){
            temp[k]=arr[i];
            i--;k--;
        }
        for(i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
        

    }
    static void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int mid=(high+low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);    
            merge(arr, low, mid, high);}
        }
    public static void main(String[] args) {
        int arr[]={1,4,2,3,7,6,8};
        int low=0;
        int high=arr.length-1;
        mergeSort(arr,low,high);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}