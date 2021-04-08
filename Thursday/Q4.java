import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {



    public int[][] replace01(int arr[][], int row, int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               if(arr[i][j] ==1)
               arr[i][j]= 0 ;
               else if(arr[i][j]==0)
               arr[i][j] = 1;
            }
        }
        return arr;
    }

    public void display(int arr[][], int row, int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(arr[i][j]+"\t");
              
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4 obj = new Q4();
        int row = sc.nextInt();
        int col = sc.nextInt();
       int arr[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
               arr[i][j] = sc.nextInt();
            }
        }
       obj.display(arr,row,col);
        int result[][] = obj.replace01(arr, row, col);
        obj.display(result,row,col);
    }
}
