/*Q10 Given an array of 10 numbers, return the maximum possible total made by summing just 5 of the 10 numbers.*/

import java.util.Scanner;
public class Q10 {

    public void  Sort(int arr[])
    {
      for(int i =0;i<arr.length-1;i++)
      {
          for(int j=0;j<arr.length-i-1;j++)
          {
              if(arr[j]<arr[j+1])
              {
                  int temp = arr[j];
                  arr[j]= arr[j+1];
                  arr[j+1] = temp;
              }
          }
      }
    }
    
    public void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    public int maxSumOfFive(int arr[])
    {
        int maxSum=0;
        for(int i=0;i<5;i++)
        maxSum += arr[i];
        return maxSum;
    }
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    Q10 obj1 = new Q10();
    int []arr =  new int[10];
            for(int i=0;i<arr.length;i++)
        arr[i] = sc.nextInt();
    obj1.display(arr);
    obj1.Sort(arr);
    obj1.display(arr);
    System.out.println(obj1.maxSumOfFive(arr));

}
    
}
