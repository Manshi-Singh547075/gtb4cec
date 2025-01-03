package Day15;

import java.util.Scanner;

public class sudoku {
    //check vertical and horizontal
    static boolean check(int[][] sudoku,int i ,int j,int n,int num){
        for(int x=0;x<n;x++){
            if(sudoku[x][j]==num || sudoku[i][x]==num)
                return false;
            }
        //check bigger box
        int rn=(int)Math.sqrt(n);
        int sx=(i/rn)*rn;
        int sy=(j/rn)*rn;

        for(int x=sx;x<sx+rn;x++)
            for(int y=sy;y<sy+rn;y++)
                if(sudoku[x][y]==num)
                    return false;
        return true;
            
    }

    static boolean sudokuSolver(int[][] sudoku,int i,int j,int n){
        if(i==n)
        return true;
        if(j==n)
            return sudokuSolver(sudoku, i+1, 0, n);
        if(sudoku[i][j]!=0)
            return sudokuSolver(sudoku, i, j+1, n);
        
        for(int num=1;num<=9;num++){
            if(check(sudoku,i,j,n,num)){
                sudoku[i][j]=num;
                if(sudokuSolver(sudoku, i, j+1, n)) return true;
            }
        }
        //backtrack
        sudoku[i][j]=0;
        return false;
    }

    public static void main(String[] args) {
        int n=9;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int[][] mat= new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        System.out.println();
        System.out.println();
        sudokuSolver(mat,0,0,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }

    
}
