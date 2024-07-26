public class Dutch_flag{
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void sortColors(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;mid++;}
            else if(arr[mid]==1)
                mid++;
            else{
                swap(arr,mid,high);
                high--;
            }
        }

    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print
            (arr[i]+" ");
    }
    public static void main(String[] args){
        int[] arr={1,1,0,2,2,0,1,2,2};
        sortColors(arr);
        display(arr);
    }
}