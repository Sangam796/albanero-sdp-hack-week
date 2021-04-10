/*Q8. Given an array A of integers, we must modify the array in the following way: we choose an i and replace A[i] with -A[i], and we repeat this process K times in total. 
(We may choose the same index i multiple times.)
Return the largest possible sum of the array after modifying it in this way.*/
import java.util.Scanner;
public class Q8 {

    public static int minIndex(int array[])
    {
        int index=0;
        int minvalue = array[0];
        for(int i=1;i<5;i++)
        if(minvalue>array[i])
        {  index =i;
            minvalue = array[i];
        }
        return index;
    }

    public static int sum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];

        return sum;
    }
      public static void main(String[] args)
    {

        int n;
        System.out.println("Enter the size of an array.\n");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int array[] = new int[n];
 System.out.println("Enter the elements in the array.\n");

        for(int i=0;i<n;i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the value for k");
         int k = scan.nextInt();
int minvalue ;

while(k>0)
{
  minvalue  = Q8.minIndex(array);
    array[minvalue] = - array[minvalue];
    k--;
}
        System.out.println(Q8.sum(array));
    }
    
}

