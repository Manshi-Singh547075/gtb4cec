import Day12.recursion2;

public class dp {
    public static int fibb(int n){
        if(n==0 || n==1)
            return n;
        else
            return fibb(n-1)+fibb(n-2);

    }
    //top down approach
    public static int fibbo(int n,int[] dp){
        
        if(n==0 || n==1)
        return n;
        if(dp[n]!=0)
            return dp[n];
        int f1=fibb(n-1);
        int f2=fibb(n-2);
        return dp[n]=f1+f2;
        
    }
    // bottom up approach
    public static int fibBU(int n){
        int[] dpp=new int[n];
        dpp[0]=0;
        dpp[1]=1;
        for(int i=2;i<n;i++){
            dpp[i]=dpp[i-1]+dpp[i-2];
        }
        return dpp[n];

    }
    //leetcode ques 198
    class Solution {
        public int rob(int[] nums) {
            int [] dp = new int [nums.length];
            Arrays.fill(dp , -1);
            return rob1 (nums , nums.length-1 , dp);
        }
        public int rob1 (int [] nums , int i ,int [] dp){
            if(i<0)return 0;
            if(dp[i]!=-1)return dp[i];
            int rob = nums[i] + rob1(nums , i-2 , dp);
            int drob = rob1(nums , i-1 , dp);
             return dp[i]= Math.max(rob , drob);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibBU(6));
    }
    
}
