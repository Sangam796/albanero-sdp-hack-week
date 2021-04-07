//Q3. Count the number of 1s in a given 2D array.
import java.util.*;
class Q3
{
    int arr[][];
    int row, col;
    public Q3(int r, int c)
    {
        row = r;
        col = c;
        arr =  new int[row][col];
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void display()
    {
        System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    public int countOnes()
    {
        int count =0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               if(arr[i][j]==1)
               count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        Q3 array1 = new Q3(row,col);
        array1.input();
        array1.display();
        System.out.println(array1.countOnes());
    }
}
