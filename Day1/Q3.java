import java.util.*;
class CheckArray
{
    int array[];
    int n;
    public CheckArray(int size)
    {
        n=size;
        array = new int[n];
    }
public void putData()
{
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<array.length;i++)
    {
        array[i]= sc.nextInt();
    }
    
}
    public void evenOrOddSum()
    {
        int elementSum = 0;
        for( int i=0;i<array.length;i++)
        {
            elementSum+=array[i];
        }
        if(elementSum%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}

class Q3 
{
    public static void main(String[] args)
    {
        int size, queries;
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter the number of queries.");
 queries = scan.nextInt();   
        while(queries!=0)
       {  System.out.println("Enter the size of an array.");
       size = scan.nextInt();
       CheckArray arr = new CheckArray(size);
           arr.putData();
        arr.evenOrOddSum();
        queries--;
       }
    }
}