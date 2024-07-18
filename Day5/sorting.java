package Day5;
import java.util.Arrays;
import java.util.Collections;;
public class sorting {
    public static int minArray(int[] arr,int a){
        int min=a;

        for(int i=a+1;i<arr.length;i++){
            if(arr[min]>arr[i])
                min=i;}
        return min;

    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int idx=minArray(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
            
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static int binarySearch(int[] arr,int key) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
            }
        return -1;

    }
    public static int lowerBound(int[] arr,int key){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;}
                
            else if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
            }
            
        return ans;

    }

    public static int upperBound(int[] arr,int key){
        int start=0,end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                ans=mid+1;
                start=mid+1;}
                
            else if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
            }
            
        return ans;

    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int[] arr = {8,0,2,4,2,6,2,2};
        System.out.println(minArray(arr,1));
        selectionSort(arr);
        display(arr);
        System.out.println();
        System.out.println(lowerBound(arr, 2));
        System.out.println(upperBound(arr, 6));
        //int max=Collections.max(Arrays.aslist(arr));
    
    }   
}