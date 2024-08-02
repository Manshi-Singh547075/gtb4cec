package Day8;

import java.util.Arrays;

public class twoDArrays {
    static void insert(int[][] arr){
        int num=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=num++;
            }
        }
    }
    static void display2D(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[] search(int[][] arr,int num){
        int[] ans={-1,-1};
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==num){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;}

            }

        }
        return ans;
    }
    static int[][] transpose(int[][] arr){
        int[][] ans=new int[arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++)
                ans[i][j]=arr[j][i];
            
        }
        return ans;
    }
    public static void sortByCol(int[][] arr,int col) {
        Arrays.sort(arr,(a,b)-> Integer.compare(a[col], b[col]));
    }

    static void sortAllRow(int[][] arr){
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
    }
}
   public static int[][] sort2DArray(int[][] arr){
    int l=arr.length;
    for(int i=0;i<l;i++){
        for(int j=0;j<arr[0].length;j++){
            for(int m=0;m<l;m++){
                for(int n=0;n<arr[0].length;n++){
                    if(arr[i][j]<arr[m][n]){
                        int t=arr[i][j];
                        arr[i][j]=arr[m][n];
                        arr[m][n]=t;}
                    }
                }
            }
        }
    return arr;

    }
    
    public static int[] flatArr(int[][] arr){
        int[] nums=new int[arr.length*arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
                nums[arr[i].length*i+j]=arr[i][j];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void fillArray(int[][] arr,int[] n){
        for(int i=0;i<n.length;i++){
            arr[i/arr[0].length][i%arr[0].length]=n[i];
        }
    }
    
public static void main(String[] args) {
    int[][] arr=new int[5][4];
    insert(arr);
    int[] num=(search(arr, 5));
    System.out.println(num[0]+" "+num[1]);
    System.out.println();
    int[][] t=transpose(arr);
    //display2D(t);
    int[][] arr1={ {21,23,7,11},
            {1,15,6,4},
            {10,2,13,9} };
    
    //sortAllRow(arr1);
    //sortByCol(arr1,0);
    //sort2DArray(arr1);
    int[] arr2=flatArr(arr1);
    display(arr2);
    System.out.println();
    fillArray(arr1, arr2);
    System.out.println();
    display2D(arr1);
    }
    
}