import java.util.Scanner;

public class Q9 {

  public static int profitCalculator(int arr[])
  {
    int maxProfit = 0;
    int consecutive[] = new int[arr.length];
    for(int i=0;i<arr.length-1;i++)
    {
      consecutive[i]= arr[i+1]-arr[i];
    }

    for(int i=0;i<consecutive.length;i++)
    {
      if(consecutive[i]>0)
      maxProfit+=consecutive[i];
    }
    return maxProfit;
  }

    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
         int n;
         System.out.println("Enter the number of days.\n");
         n = scan.nextInt();
         int stock[] = new int[n];
         System.out.println("Enter the stock price for "+n+" days simultaneously.");
         for(int i=0;i<n;i++)
         stock[i] = scan.nextInt();
         System.out.println("Maximum profit = " + Q9.profitCalculator(stock));

    }
    
}
