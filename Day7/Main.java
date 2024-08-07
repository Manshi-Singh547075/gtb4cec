import java.util.*;
public class Main {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int a=nums.length;
        int m=0;
        int[] arr = new int[n*(n+1)/2];
        for(int i=0;i<a;i++){
           for(int j=i;j<a;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                    System.out.print(sum+" ");
                    //arr[m]=sum;
                    //m++;
                }
                for(int m=0;m<arr.length;m++){
                    
                }
                
            }
           
        }
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        return 0;
        /*int s=0;
        for(int i=left-1;i<right;i++){
            s+=arr[i];
        }
        return s;*/
    }
 
  
	    public static void main(String args[]) {
            int[] nums = {1,2,3,4};
            rangeSum(nums,4,3,4);
		
		
        }
}
	