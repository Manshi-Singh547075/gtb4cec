public class backTracking {
    static int s=0;
    static boolean backTrack(int[] arr,int i,int k){
        if(i==arr.length)
            return true;
        if(s>k)
            return false;
        s+=arr[i];
        if(!backTrack(arr, i+1, k)){
            s-=arr[i];
        }
        return true;
    }
    public static void sumArray(int[] arr,int i,int k){
        if(i==arr.length)
            return ;
        
        s+=arr[i];
        if(s>k)
            s-=arr[i];
        sumArray(arr,i+1,k);
     }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};
        sumArray(arr,4,140);
        System.out.println(backTrack(arr, 4, 6));
        System.out.println(s);

    }
    
}
