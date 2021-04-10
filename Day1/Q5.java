//Q5. Given an array of either entirely odd integers or entirely even integers except for a single Outlier Number. Write a program to return this number.
import java.util.Scanner;
public class Q5 {
    int arr[];
    public Q5(int size)
    {
        arr = new int[size];
    }

    public void inputArray()
    {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        arr[i] = scan.nextInt();

    }

    public void displayArray()
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public int getOutlierNum()
    {
        int outliernum=arr[0], evenCount=0, oddCount = 0;
        for(int i=0;i<arr.length;i++) 
        {
            if(evenCount>=2||oddCount>=2) //loop will iterate only upto 3 iteration
            break;
            if(arr[i]%2==0)
            evenCount++;
            else
            oddCount++;
        }
       
        for(int i=0;i<arr.length;i++)
        {

           if(evenCount>=2)
           { if(arr[i]%2!=0)
            {
               
                outliernum = arr[i];
                break;
            }
        }
        else
        {
            

            if(arr[i]%2==0)
          {  outliernum= arr[i];
            break;
          }
        }
        }
        return outliernum;
        
        

    }


    public static void main(String [] args)
    {
        int size;
        System.out.println("Enter the size of an array.");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();

        Q5 arrayOne = new Q5(size);
        System.out.println("Enter Elements in an array");
        arrayOne.inputArray();
        System.out.println("Elements in an array are");
        arrayOne.displayArray();
        System.out.println("Outlier Number is "+arrayOne.getOutlierNum());
        


    }
    
}
