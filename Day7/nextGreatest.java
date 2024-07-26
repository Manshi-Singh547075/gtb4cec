public class nextGreatest {
    public static void nextGreatestRight(int[] arr,int[] nums){
        int l=arr.length;
        int m=0;
        for(int i=l-1;i>=0;i--){
            nums[i]=m;
            m=Math.max(m,arr[i]);
        }
            
    }
    
   public static void nextGreatestLeft(int[] arr,int[] nums){
        int l=arr.length;
        int m=0;
        for(int i=0;i<l;i++){
            nums[i]=m;
            m=Math.max(m,arr[i]);}
}
    public static void nextSmallestRight(int[] arr,int[] nums){
        int l=arr.length;
        int mini=100;
        for(int i=l-1;i>=0;i--){
                nums[i]=mini;
                mini=Math.min(mini,arr[i]);
        }
    }

    public static void nextSmallestLeft(int[] arr,int[] nums){
        int l=arr.length;
        int mini=100;
        for(int i=0;i<l;i++){
                nums[i]=mini;
                mini=Math.min(mini,arr[i]);
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,8,7,3,4};
        int[] nums=new int[arr.length];
        nextGreatestRight(arr,nums);

        nextGreatestLeft(arr,nums);
        
        nextSmallestRight(arr,nums);
        
        nextSmallestLeft(arr,nums);
        display(nums);
       
    }
    
}
