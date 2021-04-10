/*Q9.  Write a program that takes an array of numbers arr and a number n. Return true if the sum of any two elements is equal to the given number. Otherwise, return false.
*/
import java.util.Scanner;
public class Q9 {

    int arr[], n;
    public Q9(int size)
    {
        n=size;
        arr =  new int[n];
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        arr[i] = sc.nextInt();
    }

    public boolean isSumPresent(int num)
    {
        boolean issumpresent = false;
        for(int i=0;i<arr.length-1;i++)
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]+arr[j+1]==num)
            return true;
            
        }
        return false;
    }
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Q9 obj1 = new Q9(size);
    obj1.input();
    System.out.println("Enter the number to be checked.");
    int num = sc.nextInt();
    System.out.println(obj1.isSumPresent(num));

}
    
}
